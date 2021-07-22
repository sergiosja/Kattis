s = set()

while True:
    try:
        r = input().split(' ')
        op = ""

        for w in r:
            if w.lower() not in s:
                op += w + " "
                s.add(w.lower())
            else:
                op += ". "

        print(op)

    except:
        break