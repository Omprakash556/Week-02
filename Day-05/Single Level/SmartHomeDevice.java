

class Device {

    String deviceId;
    String status;


    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }


    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}


class Thermostat extends Device {

    double temperatureSetting;


    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }


    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: "+temperatureSetting+ "°C");
    }
}


public class SmartHomeDevice {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("T001", "On", 22.5);


        thermostat.displayStatus();
    }
}

