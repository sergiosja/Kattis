a, b, c, n = map(int, input().split(' '))
print("YES" if (0 not in [a, b, c] and a+b+c >= n >= 3) else "NO")