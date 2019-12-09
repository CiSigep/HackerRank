from collections import Counter

num_shoes = input()
in_stock = Counter(map(int, input().split()))
num_customers = int(input())
total = 0

for i in range(num_customers):
    customer_order = list(map(int, input().split()))
    if in_stock[customer_order[0]] > 0:
        in_stock[customer_order[0]] = in_stock[customer_order[0]] - 1
        total += customer_order[1]

print(total)
