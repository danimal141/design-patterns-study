import java.util.Hashtable;

/**
 * Created by hideaki on 9/30/15.
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("circle");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("rectangle");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("square");
        shapeMap.put(square.getId(),square);
    }

}
