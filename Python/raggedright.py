def main():
    p = list()
    while True:
        try:
            p.append(len(input()))
        except:
            break

    longest = max(p)
    s = 0
    for i in p[:-1]:
        s += (longest - i) ** 2
    print(s)


if __name__ == "__main__":
    main()