T = int(input())

for i in range(T):
    try:
        a, b = map(str, input().split())
        print(int(a)//int(b))
    except (ZeroDivisionError, ValueError) as ex:
        print("Error Code:", ex)
