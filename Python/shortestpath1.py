from collections import defaultdict
import heapq as h

def dijkstra(nodes, graph, s):
    pq = [(0, s)]
    dist = defaultdict(int)
    for i in range(nodes):
        dist[i] = float('inf')
    dist[s] = 0

    while pq:
        curr = h.heappop(pq)

        for neighbour in graph[curr[1]]:
            cost = neighbour[0] + dist[curr[1]]
            if cost < dist[neighbour[1]]:
                dist[neighbour[1]] = cost
                h.heappush(pq, neighbour)

    return dist


def main():
    while True:
        graph = defaultdict(list)
        nodes, edges, queries, start = map(int, input().split())
        if sum([nodes, edges, queries, start]) == 0:
            return

        # Add edges
        for _ in range(edges):
            u, v, weight = map(int, input().split())
            graph[u].append((weight, v))

        # Find shortest distances
        d = dijkstra(nodes, graph, start)

        # Print distance
        for _ in range(queries):
            dist = d[int(input())]
            print(dist if dist != float('inf') else 'Impossible')
        print("")

if __name__ == "__main__":
    main()