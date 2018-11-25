import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        ArrayList<AbstractExpression> list = new ArrayList<AbstractExpression>();

        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression exp:list) {
            exp.interpret(context);
        }
    }
}
