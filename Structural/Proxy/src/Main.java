/**
 * Created by hideaki on 11/3/15.
 */
public class Main {

    public static void main(String[] args) {
        Image image = new ProxyImage("sample001.jpg");

        //image will be loaded from disk
        image.display();

        //image will not be loaded from disk
        image.display();
    }

}
