from collections import defaultdict

t = defaultdict(list)

for _ in range(int(input())):
    c = input().split(' ')
    t[c[0]].append(int(c[1]))

for c in t:
    t[c] = sorted(t[c])

for _ in range(int(input())):
    c = input().split(' ')
    print(t[c[0]][int(c[1])-1])
