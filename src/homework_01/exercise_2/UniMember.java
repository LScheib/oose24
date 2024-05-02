package src.homework_01.exercise_2;

public class UniMember implements IUniMember
{
    private String firstname;
    private String lastname;

    public UniMember(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String getName()
    {
        return this.firstname + ", " + this.lastname;
    }
}
