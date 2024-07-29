package main.java.com.smartdevicefactory;

public class Smartphone implements SmartDevice {
    private String model;
    private String os;

    public Smartphone(String model, String os) {
        this.model = model;
        this.os = os;
    }

    @Override
    public void specifications() {
        System.out.println("Smartphone Model: " + model);
        System.out.println("Operating System: " + os);
    }
}
