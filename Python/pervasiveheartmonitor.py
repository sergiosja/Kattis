while (True):
    try:
        inp = list(input().split(' '))
    except EOFError:
        break

    avg = list()
    name = ""

    for i in inp:
        try:
            avg.append(float(i))
        except ValueError:
            name += i + " "

    print(round(sum(avg) / len(avg), 2), name)