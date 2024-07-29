package main.java.com.smartdevicefactory;

public class SmartphoneFactory implements DeviceFactory {
    @Override
    public SmartDevice createDevice(String... specs) {
        if (specs.length != 2) {
            throw new IllegalArgumentException("Invalid specifications for Smartphone.");
        }
        return new Smartphone(specs[0], specs[1]);
    }
}
