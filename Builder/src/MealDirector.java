/**
 * Created by hideaki on 10/1/15.
 */
public class MealDirector {

    private MealBuilder mealBuilder;

    public MealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void constructMeal() {
        mealBuilder.buildDrink();
        mealBuilder.buildMainCourse();
        mealBuilder.buildSide();
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }

}
