from itertools import combinations_with_replacement

S, k = map(str, input().split())
k = int(k)

print("\n".join(["".join(combo) for combo in list(combinations_with_replacement(sorted(S), k))]))
