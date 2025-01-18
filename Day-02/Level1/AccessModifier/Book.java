
// Parent class: Book
public class Book {
    // Instance variables
    public String ISBN;
    protected String title;
    private String author;

    // Constructor to initialize the book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author name
    public String getAuthor() {
        return author;
    }

    // Public method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {

    // Constructor to initialize eBook details
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author); // Calling the parent class constructor
    }

    // Method to display eBook details (demonstrates access of protected and public members)
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member from subclass
        System.out.println("Author: " + getAuthor()); // Using public method to get private author name
    }
}

// Main class to test the Book and EBook classes
 class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book1.displayBookDetails();
        System.out.println();

        // Modifying author using the setter method
        book1.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book1.getAuthor());
        System.out.println();

        // Creating an EBook object
        EBook eBook1 = new EBook("978-1-234-56789-0", "Advanced Java", "Michael Lee");
        eBook1.displayEBookDetails();
    }
}

