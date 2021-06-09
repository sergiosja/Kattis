n = int(input())
d = dict()

for i in range(n):
    s = input().split(' ')
    try:
        d[s[1]] = int(s[0])
    except ValueError:
        d[s[0]] = int(s[1]) * 2

for k, v in sorted(d.items(), key=lambda x: x[1]):
    print(k)