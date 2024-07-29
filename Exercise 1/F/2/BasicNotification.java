package main.java.com.smarthome;

public class BasicNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Basic Notification: " + message);
    }
}
