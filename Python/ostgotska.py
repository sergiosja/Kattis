s = input().split(' ')
c = 0
for w in s:
    if "ae" in w:
        c += 1

print("dae ae ju traeligt va" if c/len(s) >= 0.4 else "haer talar vi rikssvenska")