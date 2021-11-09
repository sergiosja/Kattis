from collections import defaultdict

def one(arr):
    nums = set()
    for i in arr:
        if i not in nums:
            nums.add(7777-i)
        else:
            print("Yes")
            return
    print("No")


def two(arr):
    print("Unique" if len(arr) == len(set(arr)) else "Contains duplicate")


def three(arr):
    nums = defaultdict(lambda: 0)
    for i in arr:
        nums[i] = nums[i] + 1

    for key in nums:
        if nums[key] > len(arr) // 2:
            print(key)
            return
    print(-1)


def four(arr, n):
    arr = sorted(arr)
    if n % 2 != 0:
        print(arr[n//2])
    else:
        print(arr[(n//2)-1], arr[n//2])


def five(arr):
    narr = list(sorted(filter(lambda x: x >= 100 and x <= 999, arr)))
    for i in narr:
        print(i, end=" ")
    print()


def main():
    n, t = map(int, input().split(' '))
    arr = list(map(int, input().split(' ')))
    
    # if you have python 3.10 =< you can use match-case instead
    if t == 1:
        one(arr)
    elif t == 2:
        two(arr)
    elif t == 3:
        three(arr)
    elif t == 4:
        four(arr, n)
    else:
        five(arr)


if __name__ == "__main__":
    main()