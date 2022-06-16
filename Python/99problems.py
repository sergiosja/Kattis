def main():
    n = input()
    if int(n) <= 99:
        print(99)
        return

    upper = int(n[:-2] + "99")
    lower = ""
    if int(n[-2:]) <= 49:
        lower = int(n[:-2] + "00") - 1
    else:
        lower = int(n[:-3] + str(int(n[-3])-1) + "99")

    difs = (abs(int(n) - lower), abs(int(n) - upper))
    print(upper if difs[0] == difs[1] else upper if difs[0] > difs[1] else lower)

if __name__ == "__main__":
    main()