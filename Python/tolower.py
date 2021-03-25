p, t = map(int, input().split(' '))
total = 0

for i in range(p):
    a = []

    for j in range(t):
        a.append(input())
    
    a = list(map(lambda x: x[0].lower() + x[1:], a))

    counter = 0
    for j in range(t):
        if a[j] == a[j].lower():
            counter += 1

    if counter == t:
        total += 1

print(total)