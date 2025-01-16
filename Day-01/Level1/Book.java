import java.util.Scanner;

public class Book {
     String title;
     String author;
     double price;

    public Book(String title, String author, double price){
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Name of tile of Book is "+title+".");
        System.out.println("Name of Author of Book is "+author+".");
        System.out.println("Price of Book is "+price);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Title of Book: ");
        String title = input.nextLine();

        System.out.println("Enter Author of Book: ");
        String author = input.nextLine();

        System.out.println("Enter price of Book: ");
        double price = input.nextDouble();

        Book book = new Book(title, author, price);
        book.displayDetails();
    }
}
