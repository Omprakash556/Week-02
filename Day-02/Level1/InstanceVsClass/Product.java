public class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable shared among all products
    private static int totalProducts = 0;

    // Constructor to initialize product details and update totalProducts
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Smartphone", 499.49);
        Product product3 = new Product("Headphones", 129.99);

        // Displaying details of each product
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Displaying the total number of products created
        Product.displayTotalProducts();
    }
}

