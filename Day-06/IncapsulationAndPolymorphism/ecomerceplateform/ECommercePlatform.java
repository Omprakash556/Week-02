package IncapsulationAndPolymorphism.ecomerceplateform;

// Abstract class Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Getter and Setter methods for encapsulation

    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // Method to calculate final price price + tax - discount
    public double calculateFinalPrice() {
        double discount = calculateDiscount();
        double tax = 0;
        if (this instanceof Taxable) {
            tax = ((Taxable) this).calculateTax();
        }
        return price+tax-discount;
    }

    public void displayDetails() {
        System.out.println("ProductID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}
// Taxable interface
interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

// Electronics subclass extending Product and implementing Taxable
class Electronics extends Product implements Taxable {
    private double discountPercentage;
    public Electronics(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return (getPrice() * discountPercentage) / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15;  // Electronics have a 15% tax
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Electronics Tax Rate: 15%");
    }
}

// Clothing subclass extending Product and implementing Taxable
class Clothing extends Product implements Taxable {
    private double discountPercentage;

    public Clothing(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return (getPrice() * discountPercentage) / 100;  // Discount based on percentage
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10;  // Clothing has a 10% tax
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Clothing Tax Rate: 10%");
    }
}

// Groceries subclass extending Product (no tax for groceries, so it doesn't implement Taxable)
class Groceries extends Product {
    private double discountPercentage;

    public Groceries(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return (getPrice() * discountPercentage) / 100;  // Discount based on percentage
    }
}

// Main class to test the system
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating product objects
        Electronics electronicProduct = new Electronics(101, "Ipad", 1200, 20);  // 10% discount
        Clothing clothingProduct = new Clothing(102, "Jeans", 30, 20);  // 20% discount
        Groceries groceryProduct = new Groceries(103, "Biscuits", 5, 5);  // 5% discount

        // Adding products to an array
        Product[] products = {electronicProduct, clothingProduct, groceryProduct};

        // Displaying product details and final prices
        for (Product product : products) {
            product.displayDetails();
            System.out.println();
        }
    }
}

