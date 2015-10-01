/**
 * Created by hideaki on 9/30/15.
 */
public class Square extends Shape {

    public Square() {
        this.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

}
