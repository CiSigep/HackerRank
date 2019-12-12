M = input()
a = map(int, input().split())
N = input()
b = map(int, input().split())

a = set(a)
b = set(b)

diffA_B = a.difference(b)
diffB_A = b.difference(a)

for val in sorted(diffA_B.union(diffB_A)):
    print(val)
