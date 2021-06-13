s = set()

while True:
    try:
        i = input().split(' ')
        for j in i:
            s.add(j)            
    except EOFError:
        break

cmp = list()
for i in s:
    for j in s:
        if (i != j):
            cmp.append(i + j)

for i in sorted(set(cmp)):
    print(i)