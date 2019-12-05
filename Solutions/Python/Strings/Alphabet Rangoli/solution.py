import string

def print_rangoli(size):
    letters = string.ascii_lowercase[0:size]
    pieces  = []
    for i in range(size):
        piece = "-".join(list(letters[i:size]))
        piece = piece[1:][::-1] + piece
        pieces.append(piece.center(4 * size - 3, "-"))
    print("\n".join(reversed(pieces[1:])) + ("\n" if size > 1 else "") + "\n".join(pieces))




if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
