from collections import defaultdict

def main():
    n, m = map(int, input().split(' '))
    edges = defaultdict(list)
    indegree = [0]*n
    picked = []
    stack = []

    for _ in range(m):
        a, b = map(int, input().split(' '))
        edges[a].append(b)
        indegree[b-1] += 1

    # Find stick with indegree 0
    for i in edges:
        if not indegree[i-1]:
            stack.append(i)

    while stack:
        curr = stack.pop()
        picked.append(curr)

        # Find next stick with indegree 0
        for i in edges[curr]:
            indegree[i-1] -= 1
            if not indegree[i-1]:
                stack.append(i)

    if len(picked) == n:
        for i in picked:
            print(i)
    else:
        print("IMPOSSIBLE")


if __name__ == '__main__':
    main()
