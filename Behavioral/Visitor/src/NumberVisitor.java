import java.util.List;

/**
 * Created by hideaki on 10/4/15.
 */
public interface NumberVisitor {
    public void visit(TwoElement twoElement);
    public void visit(ThreeElement threeElement);
    public void visit(List<NumberElement> elementList);
}
