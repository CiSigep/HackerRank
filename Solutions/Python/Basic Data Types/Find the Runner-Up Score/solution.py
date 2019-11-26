if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    arr_max = max(arr)
    print(max(list(filter(lambda x: x != arr_max, arr))))
