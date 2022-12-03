import textwrap

def main():
    s = input()
    ns = ''
    for d in map(lambda x: int(x)-1, textwrap.wrap(input(), 3)):
        ns += s[d]
    print(ns)

if __name__ == "__main__":
    main()