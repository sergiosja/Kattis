from collections import Counter
import heapq as h

def main():
    _, k = map(int, input().split())
    c = Counter(input().split())
    heap = list()

    for k1, v1 in c.items():
        h.heappush(heap, (int(-v1), k1))

    for _ in range(k):
        t = h.heappop(heap)
        h.heappush(heap, (t[0]+1, t[1]))

    print(abs(h.heappop(heap)[0]))


if __name__ == "__main__":
    main()
