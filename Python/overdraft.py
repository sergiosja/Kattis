def main():
    n = int(input())
    c = 0
    o = 0

    for _ in range(n):
        c += int(input())
        if c < 0:
            o += abs(c - 0)
            c += abs(c - 0)

    print(o)

if __name__ == "__main__":
    main()