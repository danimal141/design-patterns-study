/**
 * Created by hideaki on 9/27/15.
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        //initialize the game
        initialize();

        //start game
        startPlay();

        //end game
        endPlay();
    }

}
