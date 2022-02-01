from decimal import Decimal

def main():
    a, b, c = map(float, input().split(" "))
    print(Decimal(a)*Decimal(b) if c == 1 else Decimal(a)*Decimal(b)/Decimal(c))

if __name__ == "__main__":
    main()