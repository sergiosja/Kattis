n = int(input())
tmp = list(map(int, input().split(' ')))
a = tmp[0]

for i in range(1, len(tmp)):
    b = tmp[i]
    t = b

    while a/t != int(a/t) or b/t != int(b/t):
        t -= 1
        
    print("%d/%d" %(int(a/t), int(b/t)))