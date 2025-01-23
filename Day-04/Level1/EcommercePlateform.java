import java.util.ArrayList;
import java.util.List;


class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


class Order {
    private int orderId;
    private List<Product> products; // Aggregation relationship
    private static int idCounter = 1;

    public Order() {
        this.orderId = idCounter++;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}


class Customer1 {
    private String name;
    private List<Order> orders; // Aggregation relationship

    public Customer1(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}


public class EcommercePlateform {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Headphones", 150.00);
        Product product3 = new Product("Mouse", 50.00);
        Product product4 = new Product("Keyboard", 100.00);


        Customer1 customer = new Customer1("Om Prakash");


        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);


        Order order2 = new Order();
        order2.addProduct(product3);
        order2.addProduct(product4);


        customer.placeOrder(order1);
        customer.placeOrder(order2);


        System.out.println("Customer: " + customer.getName());
        for (Order order : customer.getOrders()) {
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Products:");
            for (Product product : order.getProducts()) {
                System.out.println(product.getName() + " ($" + product.getPrice() + ")");
            }
            System.out.println("Order Total: $" + order.calculateTotal());
            System.out.println();
        }
    }
}

