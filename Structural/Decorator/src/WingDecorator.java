/**
 * Created by hideaki on 10/4/15.
 */
public class WingDecorator extends AnimalDecorator {

    public WingDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("I have wings.");
        fly();
    }

    private void fly() {
        System.out.println("I can fly.");
    }

}
