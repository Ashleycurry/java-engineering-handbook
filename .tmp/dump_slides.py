import sys, zipfile
from xml.etree import ElementTree as ET

pptx = sys.argv[1]
slides = sys.argv[2:]
A = '{http://schemas.openxmlformats.org/drawingml/2006/main}'

out = []
with zipfile.ZipFile(pptx) as z:
    for num in slides:
        name = 'ppt/slides/slide%s.xml' % num
        root = ET.fromstring(z.read(name))
        out.append('===== slide %s =====' % num)
        for t in root.iter(A + 't'):
            if t.text:
                out.append(repr(t.text))
        out.append('')

with open(r'h:\GitHub-Repository-Backup\java-engineering-handbook\.tmp\dump_out.txt', 'w', encoding='utf-8') as f:
    f.write('\n'.join(out))
print('OK')
