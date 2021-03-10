from itertools import groupby

kuna = list(map(int, input().split(' ')))
array = []
for i in range(3):
    a, b = map(int, input().split(' '))
    for j in range(a, b):
        array.append(j)

sum = 0
array.sort()
newarray = [len(list(group)) for key, group in groupby(array)]
for i in range(len(newarray)):
    if newarray[i] == 1:
        sum += kuna[0]
    elif newarray[i] == 2:
        sum += kuna[1] * 2
    else:
        sum += kuna[2] * 3

print(sum)