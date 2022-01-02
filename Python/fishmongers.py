def main():
    _, f = map(int, input().split(' '))
    fish = sorted(list(map(int, input().split(' '))))

    mongers = list()
    for _ in range(f):
        a, b = map(int, input().split(' '))
        mongers.append((a, b))

    mongers = sorted(mongers, key=lambda x: x[1])
    counter = 0

    while mongers and fish:
        a, b = mongers.pop()

        while a and fish:
            counter += b * fish.pop()
            a -= 1

    print(counter)


if __name__ == '__main__':
    main()
