/**
 * Created by hideaki on 10/3/15.
 */
public class Main {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        Context context = new Context(new OperationAdd());
        System.out.println(num1 + " + " + num2 + " = " + context.executeStrategy(num1, num2));

        context = new Context(new OperationSubstract());
        System.out.println(num1 + " - " + num2 + " = " + context.executeStrategy(num1, num2));

        context = new Context(new OperationMultiply());
        System.out.println(num1 + " * " + num2 + " = " + context.executeStrategy(num1, num2));
    }

}
