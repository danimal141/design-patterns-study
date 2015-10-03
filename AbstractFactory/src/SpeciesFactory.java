import animals.Animal;

/**
 * Created by hideaki on 10/3/15.
 */
public abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type);
}
