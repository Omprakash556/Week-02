class Vehicle{
    double maxSpeed;
    String fuelType;

    Vehicle(double maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayDetails(){
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Fuel Type: "+fuelType);
    }
}

class Car extends Vehicle{
    int seatCapacity;
    Car(double maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Seat Capacity: "+seatCapacity);
    }
}
class Truck extends Vehicle{
    int load;
    Truck(double maxSpeed, String fuelType, int load){
        super(maxSpeed, fuelType);
        this.load = load;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Loads of the Truck: "+load);
    }
}

class MotorCycle extends Vehicle{
    final int numberOfTyre;
    MotorCycle(double maxSpeed, String fuelType,int numberOfTyre ){
        super(maxSpeed, fuelType);
        this.numberOfTyre = numberOfTyre;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Tyre: "+numberOfTyre);
    }
}


public class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(70.50, "Diesel", 8);
        vehicles[1] = new Truck(60.40, "Diesel", 89);
        vehicles[2] = new MotorCycle(80, "Petrol", 2);

        for (int i=0; i<vehicles.length; i++){
            vehicles[i].displayDetails();
            System.out.println();
        }
    }
}

