import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter initial temperature: ");
            double initialTemperature = scanner.nextDouble();
            System.out.print("Enter initial humidity: ");
            double initialHumidity = scanner.nextDouble();

            WeatherService weatherService = new WeatherService(initialTemperature, initialHumidity);
            WeatherAlertApp app = new WeatherAlertApp(weatherService);

            while (true) {
                System.out.println("\n1. Subscribe User");
                System.out.println("2. Update Weather");
                System.out.println("3. Check Weather and Notify");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  

                switch (choice) {
                    case 1:
                        System.out.print("Enter user name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter user email: ");
                        String email = scanner.nextLine();
                        User user = new User(name, email);
                        app.subscribeUser(user);
                        break;
                    case 2:
                        System.out.print("Enter new temperature: ");
                        double newTemperature = scanner.nextDouble();
                        System.out.print("Enter new humidity: ");
                        double newHumidity = scanner.nextDouble();
                        weatherService.updateWeather(newTemperature, newHumidity);
                        break;
                    case 3:
                        app.checkWeatherAndNotify();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Application error: " + e.getMessage(), e);
        }
    }
}
