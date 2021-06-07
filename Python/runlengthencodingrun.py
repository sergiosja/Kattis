(n, msg) = input().split(' ')
newstr = ""

if n == "D":
    for i in range(1, len(msg)):
        if msg[i].isnumeric():
            newstr += msg[i-1] * int(msg[i])
else:
    msg += "0"
    counter = 1
    for i in range (1, len(msg)):
        if msg[i-1] == msg[i]:
            counter += 1
        else:
            newstr += "%s%i" % (msg[i-1], counter)
            counter = 1

print(newstr)