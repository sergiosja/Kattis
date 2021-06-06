t = int(input())

for i in range(t):
    n = list(input()[::-1])

    for j in range(len(n)):
        if n[j] != "0":
            n[j] = str(int(n[j]) - 1)
            break

    print(0 if sum(map(int, n)) == 0 else "".join(n)[::-1])