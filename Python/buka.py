first = input()
op = input()
second = input()

if op == "*":
    for i in range(1, len(second)):
        first += "0"

    print(first)
else:
    big = list(reversed(max(first, second)))
    small = list(reversed(min(first, second)))

    for i in range(len(small)):
        big[i] = str(int(small[i]) + int(big[i]))

    print(''.join(map(str, big))[::-1])