public class LibrarySystem {
    // Attributes
    private String title;
    private String author;
    private double price;
    boolean availability;

    // Parametrised constructor
    LibrarySystem(String title, String author, double price, boolean availability){
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    // Method to display results
    void displayResults(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Availability:"+availability);
    }
    // Method of borrow
   void borrow(){
        if(availability){
            availability = false;
            System.out.println("Book available: ");
        }else {
            System.out.println("Book is not available: ");
        }
   }

    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem("Hindi", "Prem", 34.68, true);
        librarySystem.borrow();
        librarySystem.displayResults();

        librarySystem.borrow();
        librarySystem.displayResults();

    }
}
