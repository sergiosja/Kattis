from collections import defaultdict

def main():
    n = int(input())
    cs = defaultdict(int)
    top = 0

    for _ in range(n):
        c = ''.join(sorted(list(input().split())))
        cv = cs[c]
        cs[c] = cv + 1
        if (cv + 1) > top:
            top = cv + 1

    counter = 0
    for _, v in cs.items():
        if v == top:
            counter += v

    print(counter)


if __name__ == "__main__":
    main()
