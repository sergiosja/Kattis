def main():
    n = int(input())
    while n != 0:
        r = list("????????????????????????????????")

        for _ in range(n):
            ins = input().split(' ')
            if ins[0] == "CLEAR":
                r[31-int(ins[1])] = '0'

            if ins[0] == "SET":
                r[31-int(ins[1])] = '1'

            if ins[0] == "OR":
                if r[31-int(ins[1])] == '1' or r[31-int(ins[2])] == '1':
                    r[31-int(ins[1])] = '1'

                elif r[31-int(ins[1])] != '?' and r[31-int(ins[2])] != '?':
                    r[31-int(ins[1])] = '0'

                else:
                    r[31-int(ins[1])] = '?'

            if ins[0] == "AND":
                if r[31-int(ins[1])] == '1' and r[31-int(ins[2])] == '1':
                    r[31-int(ins[1])] = '1'

                elif r[31-int(ins[1])] == '0' or r[31-int(ins[2])] == '0':
                    r[31-int(ins[1])] = '0'

                else:
                    r[31-int(ins[1])] = '?'

        print(''.join(r))
        n = int(input())


if __name__ == '__main__':
    main()
