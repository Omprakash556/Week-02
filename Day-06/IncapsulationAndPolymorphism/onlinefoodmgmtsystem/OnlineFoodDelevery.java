package IncapsulationAndPolymorphism.onlinefoodmgmtsystem;

// Abstract class FoodItem
abstract class FoodItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    // Abstract method to calculate total price
    abstract double calculateTotalPrice();
    // Concrete method to get item details
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}
// Interface Discountable
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// Class VegItem extends FoodItem and implements Discountable
class VegItem extends FoodItem implements Discountable {

    // Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implement abstract method from FoodItem
    public double calculateTotalPrice() {
        return price * quantity;
    }

    // Implement methods from Discountable interface
    public double applyDiscount() {
        return 0.05 * (price * quantity);  // 5% discount for veg items
    }

    public String getDiscountDetails() {
        return "Discount: 5% on " + itemName;
    }
}

// Class NonVegItem extends FoodItem and implements Discountable
class NonVegItem extends FoodItem implements Discountable {
    double additionalCharge;

    // Constructor
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    // Implement abstract method from FoodItem
    public double calculateTotalPrice() {
        return (price * quantity) + additionalCharge;
    }

    // Implement methods from Discountable interface
    public double applyDiscount() {
        return 0.10 * (price * quantity + additionalCharge);  // 10% discount for non-veg items
    }

    public String getDiscountDetails() {
        return "Discount: 10% on " + itemName;
    }
}
// Class Order to handle the food items and process the order
class Order {
    FoodItem[] foodItems;
    int count;

    // Constructor
    public Order(int size) {
        foodItems = new FoodItem[size];
        count = 0;
    }

    // Add food item to the order
    public void addFoodItem(FoodItem foodItem) {
        if(count < foodItems.length) {
            foodItems[count] = foodItem;
            count++;
        }
    }
    // Process the order, calculate total price, apply discount, etc.
    public void processOrder() {
        double totalPrice = 0;
        for(int i = 0; i < count; i++) {
            totalPrice += foodItems[i].calculateTotalPrice();
            System.out.println(foodItems[i].getItemDetails());
        }

        System.out.println("Total price: " + totalPrice);
        // Apply discount if applicable
        for(int i = 0; i < count; i++) {
            if(foodItems[i] instanceof Discountable) {
                Discountable discountableItem = (Discountable) foodItems[i];
                double discount = discountableItem.applyDiscount();
                System.out.println("Applied discount: " + discount);
                totalPrice -= discount;
            }
        }

        System.out.println("Final total price after discount: " + totalPrice);
    }
}


public class OnlineFoodDelevery {
    public static void main(String[] args) {
        // Create food items with discounts
        VegItem vegItem = new VegItem("Veg Pizza", 10.0, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Burger", 15.0, 3, 5.0);

        // Create an order and add food items
        Order order = new Order(5);
        order.addFoodItem(vegItem);
        order.addFoodItem(nonVegItem);

        // Process the order
        order.processOrder();
    }
}
