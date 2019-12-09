from itertools import permutations

S = list(map(str, input().split()))
S[0] = sorted(S[0])

for permute in permutations(S[0], int(S[1])):
    print("".join(permute))
