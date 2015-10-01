/**
 * Created by hideaki on 9/27/15.
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        //initialize the game
        this.initialize();

        //start game
        this.startPlay();

        //end game
        this.endPlay();
    }

}
