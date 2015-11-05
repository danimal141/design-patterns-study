/**
 * Created by hideaki on 11/5/15.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) { return true; }
        return false;
    }

}
