package main.java.com.smartdevicefactory;

public class TabletFactory implements DeviceFactory {
    @Override
    public SmartDevice createDevice(String... specs) {
        if (specs.length != 2) {
            throw new IllegalArgumentException("Invalid specifications for Tablet.");
        }
        return new Tablet(specs[0], specs[1]);
    }
}
