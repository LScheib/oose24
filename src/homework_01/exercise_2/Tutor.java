package src.homework_01.exercise_2;

public class Tutor extends Student implements IEmployee
{
    private float salary;

    public Tutor(String firstname, String lastname, String subject, float salary)
    {
        super(firstname, lastname, subject);
        this.salary = salary;
    }

    @Override
    public float getSalary()
    {
        return this.salary;
    }
}
