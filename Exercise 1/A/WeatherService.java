/*import java.util.logging.Level;
import java.util.logging.Logger;

public class WeatherService {
    private static final Logger logger = Logger.getLogger(WeatherService.class.getName());
    private double temperature;
    private double humidity;

    public WeatherService(double temperature, double humidity) {
        validateWeatherData(temperature, humidity);
        this.temperature = temperature;
        this.humidity = humidity;
        logger.info("WeatherService initialized with temperature: " + temperature + " and humidity: " + humidity);
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void updateWeather(double temperature, double humidity) {
        validateWeatherData(temperature, humidity);
        this.temperature = temperature;
        this.humidity = humidity;
        logger.info("Weather updated to temperature: " + temperature + " and humidity: " + humidity);
    }

    private void validateWeatherData(double temperature, double humidity) {
        if (temperature < -100 || temperature > 150) {
            logger.severe("Temperature out of valid range: " + temperature);
            throw new IllegalArgumentException("Temperature out of valid range.");
        }
        if (humidity < 0 || humidity > 100) {
            logger.severe("Humidity out of valid range: " + humidity);
            throw new IllegalArgumentException("Humidity out of valid range.");
        }
    }
}
*/
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeatherService {
    private static final Logger logger = Logger.getLogger(WeatherService.class.getName());
    private double temperature;
    private double humidity;

    public WeatherService(double temperature, double humidity) {
        validateWeatherData(temperature, humidity);
        this.temperature = temperature;
        this.humidity = humidity;
        logger.info("WeatherService initialized with temperature: " + temperature + " and humidity: " + humidity);
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public String getWeatherCondition() {
        if (temperature > 85) {
            return "Sunny";
        } else if (temperature < 60) {
            return "Cloudy";
        } else if (humidity > 75) {
            return "Windy";
        } else {
            return "Clear";
        }
    }

    public void updateWeather(double temperature, double humidity) {
        validateWeatherData(temperature, humidity);
        this.temperature = temperature;
        this.humidity = humidity;
        logger.info("Weather updated to temperature: " + temperature + " and humidity: " + humidity);
    }

    private void validateWeatherData(double temperature, double humidity) {
        if (temperature < -100 || temperature > 150) {
            logger.severe("Temperature out of valid range: " + temperature);
            throw new IllegalArgumentException("Temperature out of valid range.");
        }
        if (humidity < 0 || humidity > 100) {
            logger.severe("Humidity out of valid range: " + humidity);
            throw new IllegalArgumentException("Humidity out of valid range.");
        }
    }
}
