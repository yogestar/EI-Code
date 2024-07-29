package main.java.com.mealbuilder;

public abstract class MealBuilder {
    protected Meal meal;

    public void createNewMeal() {
        meal = new Meal("", "", "");
    }

    public Meal getMeal() {
        return meal;
    }

    public abstract void buildMainCourse();
    public abstract void buildSideDish();
    public abstract void buildDrink();
    public abstract void buildSize();
    public abstract void buildBreadType();
    public abstract void buildToppings();
    public abstract void buildSauce();
}
