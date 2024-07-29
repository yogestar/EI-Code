package main.java.com.smarthome;

public class EmailNotificationDecorator extends NotificationDecorator {
    public EmailNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        sendEmailNotification();
    }

    private void sendEmailNotification() {
        System.out.println("Email Notification: Sent.");
    }
}
