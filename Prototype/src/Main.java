/**
 * Created by hideaki on 9/30/15.
 */
public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = (Shape) ShapeCache.getShape("circle");
        System.out.println("Shape : " + clonedShape1.getType());
        clonedShape1.draw();

        Shape clonedShape2 = (Shape) ShapeCache.getShape("rectangle");
        System.out.println("Shape : " + clonedShape2.getType());
        clonedShape2.draw();

        Shape clonedShape3 = (Shape) ShapeCache.getShape("square");
        System.out.println("Shape : " + clonedShape3.getType());
        clonedShape3.draw();
    }
}
