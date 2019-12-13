n = input()
A = set(map(int, input().split()))
b = input()
B = set(map(int, input().split()))

print(len(A.intersection(B)))
