package main.java.com.adaptivelighting;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LightingControlSystem controlSystem = new LightingControlSystem();
            while (true) {
                System.out.println("\nAdaptive Lighting Control System:");
                System.out.println("1. Set Bright Lighting");
                System.out.println("2. Set Dim Lighting");
                System.out.println("3. Apply Lighting Strategy");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        controlSystem.setLightingStrategy(new BrightLightingStrategy());
                        System.out.println("Bright Lighting Strategy set.");
                        break;

                    case 2:
                        controlSystem.setLightingStrategy(new DimLightingStrategy());
                        System.out.println("Dim Lighting Strategy set.");
                        break;

                    case 3:
                        controlSystem.applyLighting();
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        logger.log(Level.WARNING, "Invalid choice: " + choice);
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (InputMismatchException e) {
            logger.log(Level.SEVERE, "Invalid input type. Please enter a number.", e);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An unexpected error occurred: " + e.getMessage(), e);
        }
    }
}
