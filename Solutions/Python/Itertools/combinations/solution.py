from itertools import combinations

S, k = map(str, input().split())
k = int(k)

for i in range(1, k + 1):
    print("\n".join(["".join(combo) for combo in list(combinations(sorted(S), i))]))
