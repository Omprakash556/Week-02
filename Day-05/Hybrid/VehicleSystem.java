
class Vehicle {
    String model;
    int maxSpeed;
    
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return "Model: " + model + ", Max Speed: " + maxSpeed + " km/h";
    }
}

interface Refuelable {
    void refuel();
}
class ElectricVehicle extends Vehicle {
    int batteryLevel;
    
    public ElectricVehicle(String model, int maxSpeed, int batteryLevel) {
        super(model, maxSpeed);
        this.batteryLevel = batteryLevel;
    }

    
    public void charge() {
        System.out.println(model + " is charging. Battery level is 100%.");
        batteryLevel = 100;
    }

    public String toString() {
        return super.toString() + " Battery Level: " + batteryLevel + "%";
    }
}


class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelLevel;

    
    public PetrolVehicle(String model, int maxSpeed, int fuelLevel) {
        super(model, maxSpeed);
        this.fuelLevel = fuelLevel;
    }

    public void refuel() {
        System.out.println(model + " is refueling. Fuel level is 100%.");
        fuelLevel = 100;
    }

    public String toString() {
        return super.toString() + ", Fuel Level: " + fuelLevel + "%";
    }
}


public class VehicleSystem {
    public static void main(String[] args) {
        
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla Model S", 250, 80);
        PetrolVehicle petrolVehicle = new PetrolVehicle("Toyota Corolla", 180, 50);

        
        System.out.println(electricVehicle);
        electricVehicle.charge();

        System.out.println();

        System.out.println(petrolVehicle);
        petrolVehicle.refuel();
    }
}

