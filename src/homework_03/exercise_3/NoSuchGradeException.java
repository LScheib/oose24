package hw3.a3;

public class NoSuchGradeException extends Exception {
    public NoSuchGradeException(double grade) {
        super(String.valueOf(grade));
    }
}
