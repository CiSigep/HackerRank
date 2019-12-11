from collections import defaultdict

group_A = defaultdict(list)

n, m = map(int, input().split())

for i in range(1, n + 1):
    group_A[input()].append(str(i))

for i in range(m):
    check = input()
    print(" ".join(group_A[check]) if len(group_A[check]) > 0 else "-1")
