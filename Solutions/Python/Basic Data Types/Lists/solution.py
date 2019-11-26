if __name__ == '__main__':
    N = int(input())
    arr = []
    for i in range(N):
        cmd_str = input()
        if cmd_str.startswith("print"):
            print(arr)
        elif cmd_str.startswith("reverse"):
            arr.reverse()
        elif cmd_str.startswith("sort"):
            arr.sort()
        elif cmd_str.startswith("pop"):
            arr.pop()
        elif cmd_str.startswith("append"):
            arr.append(int(cmd_str.split()[1]))
        elif cmd_str.startswith("remove"):
            arr.remove(int(cmd_str.split()[1]))
        elif cmd_str.startswith("insert"):
            arr.insert(int(cmd_str.split()[1]), int(cmd_str.split()[2]))
