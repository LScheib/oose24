package src.homework_01.exercise_2;

public class Main
{
    public static void main(String [] args)
    {
        UniMember member = new UniMember("Alice", "Wonderland");
        System.out.println("University member:\n" + member.getName());

        Student student = new Student("Alice", "Wonderland", "computer science");
        System.out.println("Student:\n" + student.getName() + ", " + student.getSubject());

        Employee employee = new Employee("Alice", "Wonderland", 48000);
        System.out.println("Employee:\n" + employee.getName() + ", " + employee.getSalary());

        Professor professor = new Professor("Alice", "Wonderland", 70000);
        System.out.println("Professor:\n" + professor.getName() + ", " + professor.getSalary());

        PhD phd = new PhD("Alice", "Wonderland", 52000);
        System.out.println("PhD:\n" + phd.getName() + ", " + phd.getSalary());

        Tutor tutor = new Tutor("Alice", "Wonderland", "computer science", 8000);
        System.out.println("Tutor:\n" + tutor.getName() + ", " + student.getSubject() + ", " + tutor.getSalary());
    }
}
