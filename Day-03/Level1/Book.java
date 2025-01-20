
public class Book {
    // Instance variables
    private static String libraryName = "Central Library";
    public  static void displayLibraryName(){
        System.out.println("Library Name: "+libraryName);
    }
    private final String ISBN;
    private String title;
    private String author;

    // Constructor to initialize the book details
    public Book(String title, String author, String ISBN) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }



    // Method to display book details
    public  void displayBookDetails() {
        if(this instanceof Book){
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }else System.out.println("This is not object of this class. ");

    }
}
class BookLibrarySystem {
    public static void main(String[] args) {
        Book.displayLibraryName();
        System.out.println();
        // Creating a Book object
        Book book1 = new Book("Java Programming", "John Doe", "892-3984-232390");
        book1.displayBookDetails();
        System.out.println();

        Book book2 = new Book("Math", "New Author", "9823-454-34");
        book2.displayBookDetails();
        System.out.println();







    }
}

