package IncapsulationAndPolymorphism.ridehailingapplication;

// Abstract class representing a Vehicle
abstract class Vehicle1 {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    public Vehicle1(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    // Abstract method to calculate fare based on distance
    public abstract double calculateFare(double distance);

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate per km: " + ratePerKm;
    }

    // Getter and Setter methods for encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}

// Interface for GPS functionality
interface GPS1 {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car class implementing Vehicle and GPS interface
class Car1 extends Vehicle1 implements GPS1 {
    public Car1(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Car fare calculation (e.g., rate per km * distance)
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return "Current location of Car: City Center";
    }

    @Override
    public void updateLocation(String newLocation) {
        System.out.println("Car location updated to: " + newLocation);
    }
}

// Bike class implementing Vehicle and GPS interface
class Bike1 extends Vehicle1 implements GPS1 {
    public Bike1(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Bike fare calculation (e.g., rate per km * distance, with bike's specific rate)
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return "Current location of Bike: Park Street";
    }

    @Override
    public void updateLocation(String newLocation) {
        System.out.println("Bike location updated to: " + newLocation);
    }
}

// Auto class implementing Vehicle and GPS interface
class Auto1 extends Vehicle1 implements GPS1 {
    public Auto1(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        // Auto fare calculation (e.g., rate per km * distance)
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return "Current location of Auto: Airport Road";
    }

    @Override
    public void updateLocation(String newLocation) {
        System.out.println("Auto location updated to: " + newLocation);
    }
}

// RideHailingApp class to demonstrate polymorphism
public class RideHailingApplication {
    public static void main(String[] args) {
        // Create different vehicle instances
        Vehicle1 car = new Car1("V001", "Om Prakash", 10.0);
        Vehicle1 bike = new Bike1("V002", "Shiv", 5.0);
        Vehicle1 auto = new Auto1("V003", "Sinkandar", 8.0);

        // Calculate fares for different vehicles
        System.out.println("Fare for Car (15 km): " + car.calculateFare(15));
        System.out.println("Fare for Bike (15 km): " + bike.calculateFare(15));
        System.out.println("Fare for Auto (15 km): " + auto.calculateFare(15));

        // Polymorphism in action: Using the same reference to calculate fare dynamically
        Vehicle1[] vehicles = {car, bike, auto};
        for (Vehicle1 vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for 10 km: " + vehicle.calculateFare(10));
            if (vehicle instanceof GPS1) {
                GPS1 gps = (GPS1) vehicle;
                System.out.println(gps.getCurrentLocation());
                gps.updateLocation("New Location");
            }
            System.out.println();
        }
    }
}
