package main.java.com.smarthome;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Notification notification = new BasicNotification();
            Notification decoratedNotification = notification;

            while (true) {
                System.out.println("\nNotification System:");
                System.out.println("1. Add Sound Alert");
                System.out.println("2. Add Email Notification");
                System.out.println("3. Add Mobile App Notification");
                System.out.println("4. Send Notification");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        decoratedNotification = new SoundAlertDecorator(decoratedNotification);
                        System.out.println("Sound Alert added.");
                        break;

                    case 2:
                        decoratedNotification = new EmailNotificationDecorator(decoratedNotification);
                        System.out.println("Email Notification added.");
                        break;

                    case 3:
                        decoratedNotification = new MobileAppNotificationDecorator(decoratedNotification);
                        System.out.println("Mobile App Notification added.");
                        break;

                    case 4:
                        System.out.print("Enter notification message: ");
                        String message = scanner.nextLine();
                        decoratedNotification.sendNotification(message);
                        break;

                    case 5:
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
