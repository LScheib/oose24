package homework_04.exercise_3;

@FunctionalInterface
public interface Strategy<T> {
    T perform(T a, T b);
}
