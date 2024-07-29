package main.java.com.smartdevicefactory;

public class SmartwatchFactory implements DeviceFactory {
    @Override
    public SmartDevice createDevice(String... specs) {
        if (specs.length != 2) {
            throw new IllegalArgumentException("Invalid specifications for Smartwatch.");
        }
        return new Smartwatch(specs[0], Boolean.parseBoolean(specs[1]));
    }
}
