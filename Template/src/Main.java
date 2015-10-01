/**
 * Created by hideaki on 9/27/15.
 */
public class Main {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }

}
