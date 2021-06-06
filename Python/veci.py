from itertools import permutations

s1 = input()
s = permutations(list(s1))
s = sorted(set([''.join(i) for i in s]))
print(0 if s[len(s)-1] == s1 else s[s.index(s1)+1])