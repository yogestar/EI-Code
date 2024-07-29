package main.java.com.mealbuilder;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Create an instance of CustomMealBuilder
            CustomMealBuilder builder = new CustomMealBuilder(scanner);

            // Initialize the meal object
            builder.createNewMeal();

            while (true) {
                System.out.println("\nMeal Builder Menu:");
                System.out.println("1. Set Main Course");
                System.out.println("2. Set Side Dish");
                System.out.println("3. Set Drink");
                System.out.println("4. Set Size");
                System.out.println("5. Set Bread Type");
                System.out.println("6. Set Toppings");
                System.out.println("7. Set Sauce");
                System.out.println("8. Show Meal Details");
                System.out.println("9. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        builder.buildMainCourse();
                        break;
                    case 2:
                        builder.buildSideDish();
                        break;
                    case 3:
                        builder.buildDrink();
                        break;
                    case 4:
                        builder.buildSize();
                        break;
                    case 5:
                        builder.buildBreadType();
                        break;
                    case 6:
                        builder.buildToppings();
                        break;
                    case 7:
                        builder.buildSauce();
                        break;
                    case 8:
                        Meal meal = builder.getMeal();
                        System.out.println("Meal Details:");
                        System.out.println("Main Course: " + meal.getMainCourse());
                        System.out.println("Side Dish: " + meal.getSideDish());
                        System.out.println("Drink: " + meal.getDrink());
                        System.out.println("Size: " + meal.getSize());
                        System.out.println("Bread Type: " + meal.getBreadType());
                        System.out.println("Toppings: " + meal.getToppings());
                        System.out.println("Sauce: " + meal.getSauce());
                        break;
                    case 9:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred: " + e.getMessage(), e);
        }
    }
}
