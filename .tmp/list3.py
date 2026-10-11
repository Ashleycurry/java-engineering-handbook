import os

d = r'h:\GitHub-Repository-Backup\java-engineering-handbook\.tmp\out'
out = []
for name in sorted(os.listdir(d)):
    if '__003-' in name:
        path = os.path.join(d, name)
        with open(path, encoding='utf-8') as g:
            lines = sum(1 for _ in g)
        out.append('%5d  %s' % (lines, name))

with open(r'h:\GitHub-Repository-Backup\java-engineering-handbook\.tmp\list3.txt', 'w', encoding='utf-8') as f:
    f.write('\n'.join(out))
print('OK')
