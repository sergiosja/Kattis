n = int(input())
for i in range(n):
    m = int(input())
    s = []
    for j in range(m):
        r = input()
        if r not in s:
            s.append(r)

    print(len(s))