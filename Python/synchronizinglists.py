n = int(input())

while (n != 0):
    origlist = []
    sortedfirst = []
    sortedsecond = []
    hashmap = {}

    for i in range(n):
        origlist.append(int(input()))

    for i in range(n):
        sortedsecond.append(int(input()))

    sortedfirst = sorted(origlist)
    sortedsecond.sort()

    for i in range(n):
        hashmap[sortedfirst[i]] = sortedsecond[i]

    for i in range(len(origlist)):
        print(hashmap[origlist[i]])

    print("\n")
    n = int(input())