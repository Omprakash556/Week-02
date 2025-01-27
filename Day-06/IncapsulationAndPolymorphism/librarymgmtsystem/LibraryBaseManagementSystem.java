package IncapsulationAndPolymorphism.librarymgmtsystem;


// Abstract class representing a library item
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private String borrower;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.borrower = null;  // Initially no borrower
    }

    // Abstract method to get loan duration
    public abstract int getLoanDuration();

    // Concrete method to get item details
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public void borrow(String borrower) {
        this.borrower = borrower;
    }

    public void returnItem() {
        this.borrower = null;
    }

    public String getBorrower() {
        return borrower;
    }
}
// Interface for reservable items
interface Reservable {
    void reserveItem();
    String checkAvailability();
}
// Book class inheriting from LibraryItem and implementing Reservable
class Book extends LibraryItem implements Reservable {
    private String genre;
    private boolean available;

    public Book(String itemId, String title, String author, String genre) {
        super(itemId, title, author);
        this.genre = genre;
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 14;  // Book loan duration is 14 days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }

    @Override
    public String checkAvailability() {
        return available ? "Available" : "Not available";
    }
}
// Magazine class inheriting from LibraryItem and implementing Reservable
class Magazine extends LibraryItem implements Reservable {
    private String issue;
    private boolean available;

    public Magazine(String itemId, String title, String author, String issue) {
        super(itemId, title, author);
        this.issue = issue;
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 7;  // Magazine loan duration is 7 days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available for reservation.");
        }
    }

    @Override
    public String checkAvailability() {
        return available ? "Available" : "Not available";
    }
}
// DVD class inheriting from LibraryItem and implementing Reservable
class DVD extends LibraryItem implements Reservable {
    private String region;
    private boolean available;

    public DVD(String itemId, String title, String author, String region) {
        super(itemId, title, author);
        this.region = region;
        this.available = true;
    }

    @Override
    public int getLoanDuration() {
        return 3;  // DVD loan duration is 3 days
    }

    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available for reservation.");
        }
    }

    @Override
    public String checkAvailability() {
        return available ? "Available" : "Not available";
    }
}

// Main class to demonstrate polymorphism
public class LibraryBaseManagementSystem {
    public static void main(String[] args) {
        // Create instances of different LibraryItems
        LibraryItem book1 = new Book("101", "1984", "Game of thrones", "Dystopian");
        LibraryItem magazine1 = new Magazine("102", "House Of Dragons", "Various", "December 2024");
        LibraryItem dvd1 = new DVD("103", "The Matrix", "The Witcher", "Region 1");
        // Polymorphism: Using LibraryItem reference to manage different items
        LibraryItem[] libraryItems = {book1, magazine1, dvd1};
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("Availability: " + ((Reservable) item).checkAvailability());
            System.out.println();
        }
        // Reserve items
        ((Reservable) book1).reserveItem();  // Reserve the book
        ((Reservable) magazine1).reserveItem();  // Reserve the magazine
        ((Reservable) dvd1).reserveItem();  // Reserve the DVD
    }
}

