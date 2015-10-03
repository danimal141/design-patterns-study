import animals.Animal;
import animals.Cat;
import animals.Dog;
import com.sun.tools.javac.util.FatalError;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by hideaki on 10/3/15.
 */
public class MammalFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (type.equals("dog")) {
            return new Dog();
        } else if (type.equals("cat")) {
            return new Cat();
        } else {
            throw new NotImplementedException();
        }
    }

}
