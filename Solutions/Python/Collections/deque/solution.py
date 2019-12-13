from collections import deque

d = deque()

for i in range (int(input())):
    operations = input().split()
    op = None
    value = None
    if len(operations) == 2:
        op, value = operations
    else:
        op = operations[0]

    method = getattr(d, op)
    if value == None:
        method()
    else:
        method(value)

print(" ".join(d))
