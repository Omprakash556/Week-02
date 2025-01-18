public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 100.0;

    // Constructor to initialize ownerName and vehicleType
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("The registration fee has been updated to: $" + registrationFee);
    }

    // Main method to test the Vehicle class
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorcycle");

        // Displaying initial vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details:");
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Updating registration fee using the class method
        Vehicle.updateRegistrationFee(150.0);

        // Displaying updated vehicle details
        System.out.println("Vehicle 1 Details (after fee update):");
        vehicle1.displayVehicleDetails();
        System.out.println();

        System.out.println("Vehicle 2 Details (after fee update):");
        vehicle2.displayVehicleDetails();
    }
}
