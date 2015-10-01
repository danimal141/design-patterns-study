/**
 * Created by hideaki on 10/1/15.
 */
public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        System.out.println("This meal is " + mealDirector.getMeal());

        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.constructMeal();
        System.out.println("This meal is " + mealDirector.getMeal());
    }

}
