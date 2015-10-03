/**
 * Created by hideaki on 9/30/15.
 */
public class Rectangle extends Shape {

    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }

}
