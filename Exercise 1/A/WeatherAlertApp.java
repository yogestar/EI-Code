/*import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeatherAlertApp {
    private static final Logger logger = Logger.getLogger(WeatherAlertApp.class.getName());
    private WeatherService weatherService;
    private List<User> subscribedUsers;

    public WeatherAlertApp(WeatherService weatherService) {
        if (weatherService == null) {
            logger.severe("WeatherService cannot be null.");
            throw new IllegalArgumentException("WeatherService cannot be null.");
        }
        this.weatherService = weatherService;
        this.subscribedUsers = new CopyOnWriteArrayList<>(); // Thread-safe list
        logger.info("WeatherAlertApp initialized.");
    }

    public void subscribeUser(User user) {
        if (user == null) {
            logger.severe("User cannot be null.");
            throw new IllegalArgumentException("User cannot be null.");
        }
        subscribedUsers.add(user);
        logger.info("User subscribed: " + user.getEmail());
    }

    public void checkWeatherAndNotify() {
        try {
            double temperature = weatherService.getTemperature();
            double humidity = weatherService.getHumidity();

            if (temperature > 100) {
                sendAlert("Heatwave warning: Temperature exceeds 100°F.");
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error checking weather: " + e.getMessage(), e);
        }
    }

    private void sendAlert(String message) {
        CompletableFuture<?>[] futures = subscribedUsers.stream()
            .map(user -> CompletableFuture.runAsync(() -> {
                try {
                    user.receiveNotification(message);
                } catch (Exception e) {
                    logger.log(Level.SEVERE, "Failed to send notification to " + user.getEmail() + ": " + e.getMessage(), e);
                }
            }))
            .toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(futures).join();
    }
}
*/
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeatherAlertApp {
    private static final Logger logger = Logger.getLogger(WeatherAlertApp.class.getName());
    private WeatherService weatherService;
    private List<User> subscribedUsers;

    public WeatherAlertApp(WeatherService weatherService) {
        if (weatherService == null) {
            logger.severe("WeatherService cannot be null.");
            throw new IllegalArgumentException("WeatherService cannot be null.");
        }
        this.weatherService = weatherService;
        this.subscribedUsers = new CopyOnWriteArrayList<>(); // Thread-safe list
        logger.info("WeatherAlertApp initialized.");
    }

    public void subscribeUser(User user) {
        if (user == null) {
            logger.severe("User cannot be null.");
            throw new IllegalArgumentException("User cannot be null.");
        }
        subscribedUsers.add(user);
        logger.info("User subscribed: " + user.getEmail());
    }

    public void checkWeatherAndNotify() {
        try {
            double temperature = weatherService.getTemperature();
            double humidity = weatherService.getHumidity();
            String condition = weatherService.getWeatherCondition();

            String alertMessage = String.format("Current weather condition is %s with temperature: %.2f°F and humidity: %.2f%%.",
                condition, temperature, humidity);

            if (condition.equals("Sunny") && temperature > 100) {
                alertMessage = "Heatwave warning: Temperature exceeds 100°F. " + alertMessage;
            }

            sendAlert(alertMessage);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error checking weather: " + e.getMessage(), e);
        }
    }

    private void sendAlert(String message) {
        CompletableFuture<?>[] futures = subscribedUsers.stream()
            .map(user -> CompletableFuture.runAsync(() -> {
                try {
                    user.receiveNotification(message);
                } catch (Exception e) {
                    logger.log(Level.SEVERE, "Failed to send notification to " + user.getEmail() + ": " + e.getMessage(), e);
                }
            }))
            .toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(futures).join();
    }
}
