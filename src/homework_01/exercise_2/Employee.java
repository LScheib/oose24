package src.homework_01.exercise_2;

public class Employee extends UniMember implements IEmployee
{
    private float salary;

    public Employee(String firstname, String lastname, float salary)
    {
        super(firstname, lastname);
        this.salary = salary;
    }

    @Override
    public float getSalary()
    {
        return this.salary;
    }
}
