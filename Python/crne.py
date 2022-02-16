def main():
    n = int(input())

    k = n//2+1
    if n % 2 == 0:
        print(k**2)
    else:
        print(k**2+k)

if __name__ == "__main__":
    main()