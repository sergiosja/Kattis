l = list(map(int, input().split(' ')))
parts = []

for i in range(l[1]):
    p = input()
    if p not in parts:
        parts.append(p)
    
    if len(parts) == l[0]:
        break

if (len(parts) == l[0]):
    print(i+1)
else:
    print("paradox avoided")