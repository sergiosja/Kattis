tc = int(input())

for i in range(tc):
    n = int(input())
    toys = dict()

    for j in range(n):
        toy = input().split(' ')
        if toy[0] in toys:
            toys[toy[0]] += int(toy[1])
        else:
            toys[toy[0]] = int(toy[1])

    print(len(toys))
    for t in sorted(toys.items(), key=lambda kv: (-kv[1], kv[0])):
        print(t[0], t[1])