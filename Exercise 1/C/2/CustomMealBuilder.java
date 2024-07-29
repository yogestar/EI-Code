package main.java.com.mealbuilder;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomMealBuilder extends MealBuilder {
    private static final Logger logger = Logger.getLogger(CustomMealBuilder.class.getName());
    private Scanner scanner;

    public CustomMealBuilder(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void buildMainCourse() {
        try {
            System.out.print("Enter main course (Chicken, Beef, Vegetarian): ");
            String mainCourse = scanner.nextLine();
            meal.setMainCourse(mainCourse);
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Error in setting main course: " + e.getMessage(), e);
        }
    }

    @Override
    public void buildSideDish() {
        try {
            System.out.print("Enter side dish (Fries, Salad, Soup): ");
            String sideDish = scanner.nextLine();
            meal.setSideDish(sideDish);
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Error in setting side dish: " + e.getMessage(), e);
        }
    }

    @Override
    public void buildDrink() {
        try {
            System.out.print("Enter drink (Water, Soda, Juice): ");
            String drink = scanner.nextLine();
            meal.setDrink(drink);
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Error in setting drink: " + e.getMessage(), e);
        }
    }

    @Override
    public void buildSize() {
        try {
            System.out.print("Enter meal size (Small, Medium, Large): ");
            String size = scanner.nextLine();
            meal.setSize(size);
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Error in setting meal size: " + e.getMessage(), e);
        }
    }

    @Override
    public void buildBreadType() {
        try {
            System.out.print("Enter bread type (White, Whole Wheat, Gluten-Free): ");
            String breadType = scanner.nextLine();
            meal.setBreadType(breadType);
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Error in setting bread type: " + e.getMessage(), e);
        }
    }

    @Override
    public void buildToppings() {
        try {
            System.out.print("Enter toppings (Lettuce, Tomato, Cheese, etc.): ");
            String toppings = scanner.nextLine();
            meal.setToppings(toppings);
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Error in setting toppings: " + e.getMessage(), e);
        }
    }

    @Override
    public void buildSauce() {
        try {
            System.out.print("Enter sauce (Ketchup, Mayonnaise, Mustard, etc.): ");
            String sauce = scanner.nextLine();
            meal.setSauce(sauce);
        } catch (IllegalArgumentException e) {
            logger.log(Level.SEVERE, "Error in setting sauce: " + e.getMessage(), e);
        }
    }
}
