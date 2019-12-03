# Enter your code here. Read input from STDIN. Print output to STDOUT


design = ".|."
n, m = map(int, input().split())

pieces = []
for i in range(0, int((n - 1) / 2)):
    pieces.append(((design * (2 * i + 1)).center(m, "-")))

print("\n".join(pieces) + "\n" + "WELCOME".center(m, "-") + "\n" + "\n".join(reversed(pieces)))
