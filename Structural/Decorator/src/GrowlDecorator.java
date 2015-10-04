/**
 * Created by hideaki on 10/4/15.
 */
public class GrowlDecorator extends AnimalDecorator {

    public GrowlDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        growl();
    }

    private void growl() {
        System.out.println("Grrrrr.");
    }

}
