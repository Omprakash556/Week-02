
    public class CarRental {
        // Attributes
        private String customerName;
        private String carModel;
        private int rentalDays;
        private static final double DAILY_RATE = 50.0; // Fixed daily rate for car rental

        // Default constructor
        public CarRental() {
            this.customerName = "Unknown";
            this.carModel = "Standard";
            this.rentalDays = 1;
        }

        // Parameterized constructor
        public CarRental(String customerName, String carModel, int rentalDays) {
            this.customerName = customerName;
            this.carModel = carModel;
            this.rentalDays = rentalDays;
        }

        // Method to calculate the total cost
        public double calculateTotalCost() {
            return rentalDays * DAILY_RATE;
        }

        // Method to display rental details
        public void displayRentalDetails() {
            System.out.println("Customer Name: " + customerName);
            System.out.println("Car Model: " + carModel);
            System.out.println("Rental Days: " + rentalDays);
            System.out.println("Total Cost: $" + calculateTotalCost());
        }

        // Main method to test the class
        public static void main(String[] args) {
            // Using the default constructor
            CarRental rental1 = new CarRental();
            rental1.displayRentalDetails();

            System.out.println();

            // Using the parameterized constructor
            CarRental rental2 = new CarRental("John Doe", "Toyota Corolla", 5);
            rental2.displayRentalDetails();
        }
    }

