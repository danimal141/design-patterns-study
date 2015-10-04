import java.util.List;

/**
 * Created by hideaki on 10/4/15.
 */
public class TotalSumVisitor implements NumberVisitor {

    int totalSum = 0;

    @Override
    public void visit(TwoElement twoElement) {
        int sum = twoElement.a + twoElement.b;
        System.out.println("Adding " + twoElement.a + "+" + twoElement.b + "=" + sum + " to total");
        totalSum += sum;
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int sum = threeElement.a + threeElement.b + threeElement.c;
        System.out.println("Adding " + threeElement.a + "+" + threeElement.b + "+" + threeElement.c + "=" + sum + " to total");
        totalSum += sum;
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement elem : elementList) {
            elem.accept(this);
        }
    }

    public int getTotalSum() {
        return totalSum;
    }

}
