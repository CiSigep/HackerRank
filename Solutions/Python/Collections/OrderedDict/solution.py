from collections import OrderedDict

N = int(input())
purchases = OrderedDict()

for i in range(N):
    partitioned = input().rpartition(" ")
    purchases[partitioned[0]] = purchases.get(partitioned[0], 0) + int(partitioned[2])

for item_name, net_price in purchases.items():
    print(item_name, net_price) 
