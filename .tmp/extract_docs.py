# -*- coding: utf-8 -*-
"""Temporary helper: extract text from all pptx/pdf under docs/ into .tmp/out/"""
import os, re, sys, zipfile
from xml.etree import ElementTree as ET

ROOT = os.path.dirname(os.path.abspath(__file__))          # .tmp
REPO = os.path.dirname(ROOT)                                # java-engineering-handbook
DOCS = os.path.join(REPO, 'docs')
OUT = os.path.join(ROOT, 'out')
os.makedirs(OUT, exist_ok=True)

A = '{http://schemas.openxmlformats.org/drawingml/2006/main}'

def extract_pptx(path):
    chunks = []
    with zipfile.ZipFile(path) as z:
        names = z.namelist()
        slide_re = re.compile(r'ppt/slides/slide(\d+)\.xml$')
        slides = []
        for n in names:
            m = slide_re.match(n)
            if m:
                slides.append((int(m.group(1)), n))
        slides.sort()
        for num, name in slides:
            xml = z.read(name)
            try:
                root = ET.fromstring(xml)
            except ET.ParseError:
                chunks.append(f"=== Slide {num} === (XML parse error)")
                continue
            lines = []
            for p in root.iter(A + 'p'):
                texts = [(t.text or '') for t in p.iter(A + 't')]
                line = ''.join(texts).strip()
                if line:
                    lines.append(line)
            if lines:
                chunks.append(f"=== Slide {num} ===")
                chunks.extend(lines)
        # speaker notes
        note_re = re.compile(r'ppt/notesSlides/notesSlide(\d+)\.xml$')
        notes = []
        for n in names:
            m = note_re.match(n)
            if m:
                notes.append((int(m.group(1)), n))
        notes.sort()
        nlines = []
        for num, name in notes:
            xml = z.read(name)
            try:
                root = ET.fromstring(xml)
            except ET.ParseError:
                continue
            lines = []
            for p in root.iter(A + 'p'):
                texts = [(t.text or '') for t in p.iter(A + 't')]
                line = ''.join(texts).strip()
                if line:
                    lines.append(line)
            if lines:
                nlines.append(f"--- notesSlide {num} ---")
                nlines.extend(lines)
        if nlines:
            chunks.append("=== SPEAKER NOTES ===")
            chunks.extend(nlines)
    return '\n'.join(chunks)

def extract_pdf(path):
    # try multiple backends
    try:
        import fitz  # PyMuPDF
        doc = fitz.open(path)
        parts = []
        for i, page in enumerate(doc, 1):
            parts.append(f"=== Page {i} ===")
            parts.append(page.get_text())
        return '\n'.join(parts)
    except ImportError:
        pass
    try:
        from pypdf import PdfReader
    except ImportError:
        try:
            from PyPDF2 import PdfReader
        except ImportError:
            return None
    reader = PdfReader(path)
    parts = []
    for i, page in enumerate(reader.pages, 1):
        parts.append(f"=== Page {i} ===")
        parts.append(page.extract_text() or '')
    return '\n'.join(parts)

def main():
    report = []
    for dirpath, dirnames, filenames in os.walk(DOCS):
        dirnames.sort()
        for fn in sorted(filenames):
            full = os.path.join(dirpath, fn)
            rel = os.path.relpath(full, REPO).replace('\\', '/')
            stem = os.path.splitext(fn)[0]
            if fn.lower().endswith('.pptx'):
                text = extract_pptx(full)
            elif fn.lower().endswith('.pdf'):
                text = extract_pdf(full)
                if text is None:
                    report.append(f"SKIP (no pdf backend): {rel}")
                    continue
            else:
                continue
            outname = re.sub(r'[\\/:*?"<>|]', '_', rel.replace('/', '__')) + '.txt'
            outpath = os.path.join(OUT, outname)
            with open(outpath, 'w', encoding='utf-8') as f:
                f.write(f"SOURCE: {rel}\n\n")
                f.write(text)
            nslides = text.count('=== Slide ')
            npages = text.count('=== Page ')
            report.append(f"OK chars={len(text):>7} slides={nslides:>4} pages={npages:>4}  {rel}")
    print('\n'.join(report))

if __name__ == '__main__':
    sys.stdout.reconfigure(encoding='utf-8')
    main()
