def rec(a, b, acc):
    if not (a and b):
        return acc + a + b

    if a[0] < b[0]:
        return rec(a[1:], b, acc+a[0])
    else:
        return rec(a, b[1:], acc+b[0])

def main():
    print(rec(input(), input(), ""))

if __name__ == "__main__":
    main()
