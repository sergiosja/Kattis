import math
n, m = map(int, input().split(' '))
ds = list()

for i in range(n):
    ds.append(list(map(int, input().split(' '))))

totv = 0
totw = 0

for i in range(1, m+1):
    a = 0
    b = 0

    for j in range(n):
        if i == ds[j][0]:
            a += ds[j][1]
            b += ds[j][2]

    majority = math.floor((a+b)/2+1)
    totv += a+b

    if a > b:
        print("A %d %d" % (a - majority, b))
        totw += (a - majority) - b
    else:
        print("B %d %d" % (a, b - majority))
        totw += a - (b - majority)

print(abs(totw / totv))