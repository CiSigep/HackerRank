from collections import namedtuple

N = int(input())
Grades = namedtuple("Grades", input().split())
total = 0

for i in range(N):
    fields = input().split()
    student_grade = Grades(fields[0], fields[1], fields[2], fields[3])
    total += int(student_grade.MARKS)

print("{:.2f}".format(float(total)/float(N)))
