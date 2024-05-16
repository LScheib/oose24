class LearningGroup:
    def __init__(self):
        self.studentList = []

    def add_student(self, student):
        self.studentList.append(student)

    def __str__(self):
        return str([str(student) for student in self.studentList])

    def __add__(self, student):
        if isinstance(student, Student):
            self.add_student(student)
            return self
        else:
            raise ValueError("Can only add a Student object to a LearningGroup")


class Student:
    def __init__(self, name, matNr):
        self.name = name
        self.matNr = matNr

    def __str__(self):
        return self.name + ' ' + str(self.matNr)

    def __add__(self, other):
        if isinstance(other, Student):
            group = LearningGroup()
            group.add_student(self)
            group.add_student(other)
            return group
        else:
            raise ValueError("Can only add two Student objects together")

if __name__ == '__main__':
    student1 = Student('Alice Wonderland', 42424242)
    student2 = Student('Bob Miller', 1564153)
    student3 = Student('Charly Robert', 4681398)

    group = student1 + student2
    print(group)
    group = group + student3
    group2 = student1 + student2 + student3

    print(group)
    print(group2)