/**
 * Created by hideaki on 10/4/15.
 */
public class Main {

    public static void main(String[] args) {
        Animal animal = new LivingAnimal();
        animal.describe();

        animal = new LegDecorator(animal);
        animal.describe();

        animal = new WingDecorator(animal);
        animal.describe();

        animal = new GrowlDecorator(animal);
        animal.describe();
    }

}
