package main.java.com.smartdevicefactory;

public interface DeviceFactory {
    SmartDevice createDevice(String... specs);
}
