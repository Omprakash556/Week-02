package Level2;
public class MovieTicket {
    // Attributes
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the movie ticket details
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0.0;
    }

    // Method to book a ticket: assign seat and set price
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for movie: " + movieName);
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        if (seatNumber.isEmpty()) {
            System.out.println("No ticket has been booked for the movie: " + movieName);
        } else {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    // Main method to test the MovieTicket class
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket1 = new MovieTicket("Inception");
        
        // Display initial ticket details (no ticket booked yet)
        ticket1.displayTicketDetails();
        
        // Book the ticket with seat number and price
        ticket1.bookTicket("A5", 15.50);
        
        // Display updated ticket details
        ticket1.displayTicketDetails();
        
        // Create another MovieTicket object for a different movie
        MovieTicket ticket2 = new MovieTicket("Avatar 2");
        
        // Book ticket for this movie
        ticket2.bookTicket("B12", 18.00);
        
        // Display ticket details for the second movie
        ticket2.displayTicketDetails();
    }
}
