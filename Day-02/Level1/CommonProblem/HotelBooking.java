// Class name

public class HotelBooking {
    // Attributes
    String guestName;
    String roomType;
    int night;

    // Default constructor
    HotelBooking(){
        this.guestName = "Unknown";
        this.roomType = "Economy";
        this.night = 1;
    }
    // Parametrised constructor
    HotelBooking(String guestName, String roomType, int night){
        this.guestName = guestName;
        this.roomType = roomType;
        this.night = night;
    }

 //  Copy constructor
    HotelBooking(HotelBooking useAbove){
        this.guestName = useAbove.guestName;
        this.roomType = useAbove.roomType;
        this.night = useAbove.night;
    }

    // Function for Display results
    void displayResults(){
        System.out.println("GuestName: "+guestName);
        System.out.println("RoomType: "+roomType);
        System.out.println("Stay Night: "+night);
    }
    // main method
    public static void main(String[] args) {
        // Create default constructor object
        HotelBooking hotelBooking = new HotelBooking();
        hotelBooking.displayResults();

        // Create parametrised constructor object
        HotelBooking hotelBooking1 = new HotelBooking("Prakash", "Normal", 2);
        hotelBooking1.displayResults();

        // Create copy constructor object
        HotelBooking hotelBooking2 = new HotelBooking(hotelBooking1);
        hotelBooking2.displayResults();

    }
}
