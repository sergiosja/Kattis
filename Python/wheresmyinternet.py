from collections import defaultdict

def DFS(graph, start):
    stack = [start]
    visited = {start}

    while stack:
        curr = stack.pop()
        for nb in graph[curr]:
            if nb not in visited:
                stack.append(nb)
                visited.add(nb)

    return visited


def buildGraph(cables, houses):
    graph = defaultdict(list)
    check = set([i for i in range(1, cables+1)])
    graph[1].append(1)

    for _ in range(houses):
        u, v = map(int, input().split())
        graph[u].append(v)
        graph[v].append(u)

    conn = check - DFS(graph, 1)
    if conn == set():
        print("Connected")
    else:
        print(*sorted(list(conn)), sep="\n")


def main():
    a, b = map(int, input().split())
    buildGraph(a, b)


if __name__ == "__main__":
    main()
