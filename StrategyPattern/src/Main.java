public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        Strategy add = new ConcreteStrategyAdd();
        Strategy subtract = new ConcreteStrategySubtract();
        Strategy multiply = new ConcreteStrategyMultiply();

        double a = 5.7;
        double b = 6.8;

        context.setStrategy(add);
        double addValue = context.executeStrategy(a,b);

        context.setStrategy(subtract);
        double subtractValue = context.executeStrategy(a,b);

        context.setStrategy(multiply);
        double multiplyValue = context.executeStrategy(a,b);

        System.out.println(addValue);
        System.out.println(subtractValue);
        System.out.println(multiplyValue);
    }
}
