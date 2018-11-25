public class NonterminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("Nonterminal interpret called");
    }
}
