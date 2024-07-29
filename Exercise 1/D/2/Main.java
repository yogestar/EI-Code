package main.java.com.smartdevicefactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeviceFactory factory;
        SmartDevice device;

        while (true) {
            System.out.println("\nSelect the type of device to create:");
            System.out.println("1. Smartphone");
            System.out.println("2. Smartwatch");
            System.out.println("3. Tablet");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    factory = new SmartphoneFactory();
                    System.out.print("Enter Smartphone model: ");
                    String modelPhone = scanner.nextLine();
                    System.out.print("Enter Operating System: ");
                    String os = scanner.nextLine();
                    device = factory.createDevice(modelPhone, os);
                    break;
                case 2:
                    factory = new SmartwatchFactory();
                    System.out.print("Enter Smartwatch model: ");
                    String modelWatch = scanner.nextLine();
                    System.out.print("Has GPS (true/false): ");
                    String hasGPS = scanner.nextLine();
                    device = factory.createDevice(modelWatch, hasGPS);
                    break;
                case 3:
                    factory = new TabletFactory();
                    System.out.print("Enter Tablet model: ");
                    String modelTablet = scanner.nextLine();
                    System.out.print("Enter Screen Size: ");
                    String screenSize = scanner.nextLine();
                    device = factory.createDevice(modelTablet, screenSize);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println("\nDevice Specifications:");
            device.specifications();
        }

        scanner.close();
    }
}
