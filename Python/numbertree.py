def main():
    s = input().split(' ')
    root = 2**(int(s[0])+1) - 1

    if len(s) == 1:
        print(root)
    else:
        node = 0
        for c in s[1]:
            node *= 2
            node += 1 if c == 'L' else 2

        print(root - node)


if __name__ == "__main__":
    main()