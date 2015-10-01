/**
 * Created by hideaki on 10/1/15.
 */
public interface MealBuilder {
    public void buildDrink();
    public void buildMainCourse();
    public void buildSide();

    public Meal getMeal();
}
