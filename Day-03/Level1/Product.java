import java.util.Objects;

public class Product {
        // Attributes
    private static double discount = 10.0;

    public static void updateDiscount(double newDiscount){
        discount = newDiscount;
        System.out.println("Update new Discount: "+newDiscount+"%");

    }

    private final int productID;
    private String productName;
    private double price;
    private int quantity;


    Product( int productID, String productName, double price, int quantity){
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayResults(){
        if(this instanceof Product){
            double discountPrice = price-(price*discount/100);
            System.out.println("Product ID: "+productID);
            System.out.println("Product Name: "+productName);
            System.out.println("Price $ "+price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Discount Price: "+discountPrice);
        }
    }
    public static void main(String[] args) {
        Product product = new Product(1, "Biscuits",12.48, 12);
        Product product1 = new Product(2, "Maggi", 15.78, 20);
        product.displayResults();
        System.out.println();
        product1.displayResults();
        System.out.println();

        product.updateDiscount(15);
        product.displayResults();
        System.out.println();
//
//
        product.updateDiscount(15);
        product1.displayResults();

    }
}
