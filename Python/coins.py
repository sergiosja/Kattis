def main():
    n = int(input())

    alt = {0: 3, 3: 2, 2: 1}

    while True:
        print(alt[n % 4], flush=True)
        n -= alt[n % 4]

        try:
            n -= int(input())
        except:
            exit()


if __name__ == "__main__":
    main()