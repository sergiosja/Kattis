def main():
    n = int(input())
    pr = list(map(int, input().split(' ')))

    for p in range(1, n):
        if pr[p] <= pr[0]:
            print(p)
            return

    print("infinity")


if __name__ == "__main__":
    main()