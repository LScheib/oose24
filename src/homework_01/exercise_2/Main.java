package src.homework_01.exercise_2;

public class Main
{
    public static void main(String [] args)
    {
        System.out.println("member");
        UniMember member = new UniMember("Alice", "Wonderland");
        System.out.println(member.getName());

        System.out.println("student");
        Student student = new Student("Alice", "Wonderland", "computer science");
        System.out.println(student.getName() + ", " + student.getSubject());

        System.out.println("employee");
        Employee employee = new Employee("Alice", "Wonderland", 48000);
        System.out.println(employee.getName() + ", " + employee.getSalary());

        System.out.println("professor");
        Professor professor = new Professor("Alice", "Wonderland", 70000);
        System.out.println(professor.getName() + ", " + professor.getSalary());

        System.out.println("phd");
        PhD phd = new PhD("Alice", "Wonderland", 52000);
        System.out.println(phd.getName() + ", " + phd.getSalary());

        System.out.println("tutor");
        Tutor tutor = new Tutor("Alice", "Wonderland", "computer science", 8000);
        System.out.println(tutor.getName() + ", " + student.getSubject() + ", " + tutor.getSalary());
    }
}
