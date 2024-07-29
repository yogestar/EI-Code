package main.java.com.smartdevicefactory;

public class Smartwatch implements SmartDevice {
    private String model;
    private boolean hasGPS;

    public Smartwatch(String model, boolean hasGPS) {
        this.model = model;
        this.hasGPS = hasGPS;
    }

    @Override
    public void specifications() {
        System.out.println("Smartwatch Model: " + model);
        System.out.println("Has GPS: " + (hasGPS ? "Yes" : "No"));
    }
}
