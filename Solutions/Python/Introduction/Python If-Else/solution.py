if __name__ == '__main__':
    n = int(input().strip())
    is_weird = False
    if n % 2 == 1:
        is_weird = True
    elif n % 2 == 0 and n in range(2, 6): # range is exclusive
        is_weird = False
    elif n % 2 == 0 and n in range(6, 21):
        is_weird = True
    else:
        is_weird = False

    print("Weird" if is_weird else "Not Weird")
