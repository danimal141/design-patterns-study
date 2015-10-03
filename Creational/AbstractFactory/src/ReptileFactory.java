import animals.Animal;
import animals.Snake;
import animals.Tyrannosaurus;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by hideaki on 10/3/15.
 */
public class ReptileFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (type.equals("snake")) {
            return new Snake();
        } else if (type.equals("tyrannosaurus")) {
            return new Tyrannosaurus();
        } else {
            throw new NotImplementedException();
        }
    }

}
