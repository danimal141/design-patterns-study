/**
 * Created by hideaki on 10/4/15.
 */
public abstract class AnimalDecorator implements Animal {

    Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }

}
