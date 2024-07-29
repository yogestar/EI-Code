import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    private static final Logger logger = Logger.getLogger(User.class.getName());
    private String name;
    private String email;

    public User(String name, String email) {
        if (name == null || name.isEmpty()) {
            logger.severe("Name cannot be null or empty.");
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (email == null || !email.contains("@")) {
            logger.severe("Invalid email address: " + email);
            throw new IllegalArgumentException("Invalid email address.");
        }
        this.name = name;
        this.email = email;
        logger.info("User created: " + name + " with email: " + email);
    }

    public String getEmail() {
        return email;
    }

    public void receiveNotification(String message) {
        logger.info("Notification sent to " + email + ": " + message);
        System.out.println("Notification sent to " + email + ": " + message);
    }
}
