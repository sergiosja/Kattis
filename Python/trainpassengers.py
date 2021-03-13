capacity, stops = map(int, input().split(' '))
curr = 0
imp = False

for i in range(stops):
    left, entered, waited = map(int, input().split(' '))
    curr += entered - left

    if curr > capacity or curr < 0 or (capacity - curr > 0 and waited > 0):
        imp = True
        break

    if i == stops-1 and (waited > 0 or curr > 0) or i == 0 and left > 0:
        imp = True
        break

print("impossible" if imp else "possible")