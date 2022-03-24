from functools import reduce

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def lcmHelper(*nums):
    return reduce(lcm, nums)


def main():
    while True:
        try:
            print(lcmHelper(*list(map(int, input().split()))))
        except:
            return


if __name__ == "__main__":
    main()
