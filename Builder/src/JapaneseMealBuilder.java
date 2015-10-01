/**
 * Created by hideaki on 10/1/15.
 */
public class JapaneseMealBuilder implements MealBuilder {

    private Meal meal;

    public JapaneseMealBuilder() {
        meal = new Meal();
    }

    @Override
    public void buildDrink() {
        meal.setDrink("sake");
    }
    @Override
    public void buildMainCourse() {
        meal.setMainCourse("chicken teriyaki");
    }
    @Override
    public void buildSide() {
        meal.setSide("miso soup");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }

}
