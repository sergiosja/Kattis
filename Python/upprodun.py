r = int(input())
rarray = [""] * r
t = int(input())

while (t > 0):
    for i in range(r):
        rarray[i] += "*"
        t -= 1
        if t == 0:
            break

for i in rarray:
    print(i)