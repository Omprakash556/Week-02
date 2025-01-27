class Book{
    String title;
    int publicationYear;

    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo(){
        System.out.println("Book Title: "+title);
        System.out.println("Publication Year: "+publicationYear);
    }
}

class Author extends Book {
    String authorName;
    String bio;
    Author(String title, int publicationYear, String authorName, String bio){
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: "+authorName);
        System.out.println("Bio: "+bio);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {

        System.out.println("This is Super Class..");
        Book book = new Book("NCERT", 1980);
        book.displayInfo();
        System.out.println();

        System.out.println("This is Sub Class...");
        Author author = new Author("HC Verma", 2000, "Om Prakash", "Good Programmer via cheating");
        author.displayInfo();
    }
}

