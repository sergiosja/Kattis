def main():
    k = int(input())
    for _ in range(k):
        n, dvds, c = int(input()), list(map(int, input().split())), 1
        for d in dvds:
            if d == c:
                n, c = n-1, c+1
        print(n)


if __name__ == "__main__":
    main()