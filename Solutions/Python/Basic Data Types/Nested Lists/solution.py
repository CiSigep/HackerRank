if __name__ == '__main__':
    scores = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        scores.append([name, score])
    lowest = scores[0][1]
    for x in scores[1:]:
        if x[1] < lowest:
            lowest = x[1]
    lowest_removed = list(filter(lambda x: x[1] != lowest, scores))
    sec_lowest = [lowest_removed[0]]
    for x in lowest_removed[1:]:
        if x[1] < sec_lowest[0][1]:
            sec_lowest.clear()
            sec_lowest.append(x)
        elif x[1] == sec_lowest[0][1]:
            sec_lowest.append(x)
    sec_lowest.sort(key=lambda x: x[0])
    for x in sec_lowest:
        print(x[0])
