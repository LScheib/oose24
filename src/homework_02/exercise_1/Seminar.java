package homework_02.exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Seminar<part_T extends IStudent>
{
    private String name;
    private String id;
    private List<part_T> participants;

    public Seminar(String name, String id)
    {
        this.name = name;
        this.id = id;
        this.participants = new ArrayList<part_T>();
    }

    public void addParticipant(part_T participant)
    {
        this.participants.add(participant);
    }

    public List<part_T> getParticipants()
    {
        return this.participants;
    }

    public List<part_T> getParticipantsFromStudyProgram(String subject)
    {
        List<part_T> participants_from = new ArrayList<part_T>();
        for (part_T participant : getParticipants())
        {
            if (Objects.equals(participant.getSubject(), subject))
            {
                participants_from.add(participant);
            }
        }
        return participants_from;
    }

    public static void main(String[] args)
    {
        Seminar<PhD> phdStudents = new Seminar<PhD>("Doktorandenseminar", "");
        phdStudents.addParticipant(new PhD("Adrian", "Software Engineering"));
        phdStudents.addParticipant(new PhD("Alice", "Software Engineering"));
        phdStudents.addParticipant(new PhD("Bob", "Algorithmics"));
        phdStudents.addParticipant(new PhD("Charly", "Visual Analytics"));

        Seminar<Student> bachelorStudents = new Seminar<Student>("Seminar Software Engineering", "SSE");
        bachelorStudents.addParticipant(new Student("Zedrick", "Wirtschaftsinformatik"));
        bachelorStudents.addParticipant(new Student("Yvonne", "Wirtschaftsinformatik"));
        bachelorStudents.addParticipant(new Student("Wladislav", "Mathematik"));
        bachelorStudents.addParticipant(new Student("Xenia", "Informatik"));
        bachelorStudents.addParticipant(new Student("Udo", "Informatik"));

        System.out.println(phdStudents.getParticipantsFromStudyProgram("Software Engineering"));
        System.out.println();
        System.out.println(phdStudents.getParticipantsFromStudyProgram("Algorithmics"));
        System.out.println();
        System.out.println(phdStudents.getParticipantsFromStudyProgram("Visual Analytics"));
        System.out.println();

        System.out.println(bachelorStudents.getParticipantsFromStudyProgram("Wirtschaftsinformatik"));
        System.out.println();
        System.out.println(bachelorStudents.getParticipantsFromStudyProgram("Mathematik"));
        System.out.println();
        System.out.println(bachelorStudents.getParticipantsFromStudyProgram("Informatik"));
        System.out.println();
    }
}