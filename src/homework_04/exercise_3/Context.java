package homework_04.exercise_3;

public class Context<T> {
    
    private Strategy<T> strategy;

    public Context(Strategy<T> strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy<T> strategy) {
        this.strategy = strategy;
    }

    public T executeStrategy(T a, T b) {
        return strategy.perform(a, b);
    }
}
