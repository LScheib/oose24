package homework_03.exercise_3;

public class NoSuchGradeException extends Exception {
    public NoSuchGradeException(double grade) {
        super(String.valueOf(grade));
    }
}
