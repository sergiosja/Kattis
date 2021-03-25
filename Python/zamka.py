a = int(input())
b = int(input())
c = int(input())
cases = []

for i in range(a, b+1):
    if sum(map(int, list(str(i)))) == c:
        cases.append(i)

print(min(cases))
print(max(cases))