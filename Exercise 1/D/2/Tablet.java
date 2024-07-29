package main.java.com.smartdevicefactory;

public class Tablet implements SmartDevice {
    private String model;
    private String screenSize;

    public Tablet(String model, String screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }

    @Override
    public void specifications() {
        System.out.println("Tablet Model: " + model);
        System.out.println("Screen Size: " + screenSize);
    }
}
