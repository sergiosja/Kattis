def tree(aoa, queries, visited):
    for i in queries:
        if i not in visited:
            visited.add(i)
            tree(aoa, aoa[i], visited)

    return len(visited)


def main():
    n = int(input())
    aoa = [[] for i in range(n+1)]
    boxes = list(map(int, input().split(' ')))

    for i in range(len(boxes)):
        if boxes[i] > 0:
            aoa[boxes[i]].append(i+1)

    q = int(input())
    for i in range(q):
        queries = list(map(int, input().split(' ')))[1:]
        print(tree(aoa, queries, set()))


if __name__ == '__main__':
    main()