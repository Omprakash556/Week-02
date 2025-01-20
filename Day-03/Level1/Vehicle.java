public class Vehicle {
    private static int registrationFee = 100;

    public static void updateRegistrationFee(int newRegistrationFee){
        registrationFee = newRegistrationFee;
        System.out.println("Update Registration fee: "+newRegistrationFee);
    }

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    Vehicle(String ownerName, String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public void resultsDisplay(){
        if(this instanceof Vehicle){
            System.out.println("Owner name: "+ownerName);
            System.out.println("Vehicle Type: "+vehicleType);
            System.out.println("Registration Number: "+registrationNumber);
            System.out.println("Registration fee "+registrationFee);
        }
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Om Prakash", "Two Wheeler", "rjfj892");
        Vehicle vehicle1 = new Vehicle("Deepansh Khare", "Four Wheeler", "rnkefy89");

        vehicle.resultsDisplay();
        System.out.println();
        vehicle.resultsDisplay();
        System.out.println();

        Vehicle.updateRegistrationFee(150);
        vehicle.resultsDisplay();
        System.out.println();
        vehicle1.resultsDisplay();

    }
}
