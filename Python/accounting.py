from collections import defaultdict

def main():
    _, q = map(int, input().split(' '))
    p = defaultdict(lambda: "0")

    for _ in range(q):
        i = input().split(' ')
        if i[0] == "SET":
            p[i[1]] = i[2]
        elif i[0] == "RESTART":
            tbr = i[1]
            p = defaultdict(lambda: tbr)
        elif i[0] == "PRINT":
            print(p[i[1]])


if __name__ == "__main__":
    main()