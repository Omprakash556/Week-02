import java.util.Scanner;

public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayInformation(){
        System.out.println("Brand Name of Mobile Phone is "+brand+".");
        System.out.println("Model Name of Mobile Phone is "+model+".");
        System.out.println("Price of Mobile Phone is "+price);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Brand Name of Mobile Phone: ");
        String brand = input.nextLine();

        System.out.println("Enter model of Mobile Phone: ");
        String model = input.nextLine();

        System.out.println("Enter Price of Mobile Phone ");
        double price = input.nextDouble();

        MobilePhone mobilePhone  = new MobilePhone(brand, model, price);
        mobilePhone.displayInformation();

    }
}
