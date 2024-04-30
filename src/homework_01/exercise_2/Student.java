package src.homework_01.exercise_2;

public class Student extends UniMember implements IStudent
{
    private String subject;

    public Student(String firstname, String lastname, String subject)
    {
        super(firstname, lastname);
        this.subject = subject;
    }

    @Override
    public String getSubject()
    {
        return this.subject;
    }
}
