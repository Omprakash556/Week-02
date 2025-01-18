public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    Book(){
        this.title = "Unknown";
        this.author = "Not Known";
        this.price = 00;
    }
    // Parametrised constructor
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("This is parameterized constructors. ");
    }
    // Method to display results
    void displayDetails(){
        System.out.println("Title of Book: "+title);
        System.out.println("Author of Book: "+author);
        System.out.println("Price of Book: "+price);
    }
    public static void main(String[] args) {

        // Using the default constructor
        Book book = new Book();
        book.displayDetails();
        // Using the parametrised constructor
        Book book1 = new Book("newTitle", "newAuthor", 34.90);
        book1.displayDetails();
        ;
    }
}
