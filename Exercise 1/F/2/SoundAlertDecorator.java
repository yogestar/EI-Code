package main.java.com.smarthome;

public class SoundAlertDecorator extends NotificationDecorator {
    public SoundAlertDecorator(Notification decoratedNotification) {
        super(decoratedNotification);
    }

    @Override
    public void sendNotification(String message) {
        super.sendNotification(message);
        addSoundAlert();
    }

    private void addSoundAlert() {
        System.out.println("Sound Alert: Beep beep!");
    }
}
