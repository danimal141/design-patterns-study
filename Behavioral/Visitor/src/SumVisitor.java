import java.util.List;

/**
 * Created by hideaki on 10/4/15.
 */
public class SumVisitor implements NumberVisitor {

    @Override
    public void visit(TwoElement twoElement) {
        int sum = twoElement.a + twoElement.b;
        System.out.println(twoElement.a + "+" + twoElement.b + "=" + sum);
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int sum = threeElement.a + threeElement.b + threeElement.c;
        System.out.println(threeElement.a + "+" + threeElement.b + "+" + threeElement.c + "=" + sum);
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement elem : elementList) {
            elem.accept(this);
        }
    }

}
