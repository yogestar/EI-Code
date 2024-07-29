package main.java.com.smarthome;

public class MobileAppNotificationDecorator extends NotificationDecorator {
    public MobileAppNotificationDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        sendMobileAppNotification();
    }

    private void sendMobileAppNotification() {
        System.out.println("Mobile App Notification: Sent.");
    }
}
