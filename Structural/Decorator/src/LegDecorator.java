/**
 * Created by hideaki on 10/4/15.
 */
public class LegDecorator extends AnimalDecorator {

    public LegDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("I have legs.");
        dance();
    }

    private void dance() {
        System.out.println("I can dance.");
    }

}
