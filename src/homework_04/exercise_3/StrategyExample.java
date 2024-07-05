package homework_04.exercise_3;

public class StrategyExample {
    public static void main(String[] args) {
        Strategy<Integer> max = (a, b) -> Math.max(a, b);
        Strategy<Integer> min = (a, b) -> Math.min(a, b);

        Strategy<Double> multiply = (a,b) -> a * b;
        Strategy<Double> divide = (a,b) -> a / b; 

        Context<Integer> context = new Context<Integer>(max);
        System.out.println("The maximum of 1 and 2 is: " + context.executeStrategy(1, 2));

        context.setStrategy(min);
        System.out.println("The minimum of 1 and 2 is: " + context.executeStrategy(10, 5));

        Context<Double> context2 = new Context<Double>(multiply);
        System.out.println("2.5 * 5.5 = " + context2.executeStrategy(2.5, 5.5));

        context2.setStrategy(divide);
        System.out.println("2.5 / 5.5 = " + context2.executeStrategy(2.5, 5.5));
    }
}
