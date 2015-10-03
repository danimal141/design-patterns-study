/**
 * Created by hideaki on 10/3/15.
 */
public class AbstractFactory {

    public SpeciesFactory getSpeciesFactory(String type) {
        if (type.equals("mammal")) {
            return new MammalFactory();
        } else {
            return new ReptileFactory();
        }
    }

}
