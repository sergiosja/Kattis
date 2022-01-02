def main():
    n = int(input())
    while n != -1:
        matrix = [list(map(int, input().split(' '))) for _ in range(n)]
        s = set()

        for x in range(n):
            for y in range(n):
                for z in range(n):
                    if matrix[x][y] and matrix[y][z] and matrix[z][x]:
                        s.add(x)

        for i in filter(lambda x: x not in s, range(n)):
            print(i, end=" ")

        n = int(input())


if __name__ == '__main__':
    main()
