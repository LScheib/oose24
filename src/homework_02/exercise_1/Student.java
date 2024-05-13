package homework_02.exercise_1;

public class Student implements IStudent {
    private String name;
    private String subject;

    public Student(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return "M.Sc. " + this.name;
    }

    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}