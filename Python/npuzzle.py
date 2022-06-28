import copy

def find_letter(goal, graph, values):
    for row in range(4):
        for piece in range(4):
            if graph[row][piece] == goal:
                return values[row][piece]


def make_list(a, b, graph):
    g = graph
    g[a][b] = 0
    q = [(a, b)]

    def make_list_inner(q, dist):
        tbs = list()
        while q:
            c, d = q.pop()

            if (c+1) <= 3:
                if g[c+1][d] == -1:
                    tbs.append((c+1, d))
                    g[c+1][d] = dist

            if (c-1) >= 0:
                if g[c-1][d] == -1:
                    tbs.append((c-1, d))
                    g[c-1][d] = dist

            if (d+1) <= 3:
                if g[c][d+1] == -1:
                    tbs.append((c, d+1))
                    g[c][d+1] = dist

            if (d-1) >= 0:
                if g[c][d-1] == -1:
                    tbs.append((c, d-1))
                    g[c][d-1] = dist

        if tbs:
            make_list_inner(tbs, dist+1)

    make_list_inner(q, 1)
    return g


def main():
    current_state = [[-1, -1, -1, -1],
                    [-1, -1, -1, -1],
                    [-1, -1, -1, -1],
                    [-1, -1, -1, -1]]
    
    referenceG = [['A', 'B', 'C', 'D'],
                  ['E', 'F', 'G', 'H'],
                  ['I', 'J', 'K', 'L'],
                  ['M', 'N', 'O', '.']]

    input_state = [list(input()) for _ in range(4)]
    tot = 0
    for i in range(4):
        for j in range(4):
            if referenceG[i][j] == '.': break
            made = make_list(i, j, copy.deepcopy(current_state))
            tot += find_letter(referenceG[i][j], input_state, made)

    print(tot)


if __name__ == "__main__":
    main()