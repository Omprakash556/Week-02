package Level2;
public class ShoppingCartSystem {

    // Inner class to represent a CartItem
    static class CartItem {
        private String itemName;
        private double price;
        private int quantity;

        // Constructor to initialize a CartItem
        public CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        // Method to calculate the total cost of this item
        public double getTotalCost() {
            return price * quantity;
        }

        // Method to display the item details
        public void displayItemDetails() {
            System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
        }

        // Getter for item name
        public String getItemName() {
            return itemName;
        }
    }

    // Array to store cart items
    private CartItem[] cartItems;
    private int itemCount; // Keeps track of the number of items in the cart

    // Constructor to initialize the shopping cart
    public ShoppingCartSystem(int capacity) {
        cartItems = new CartItem[capacity];
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = new CartItem(itemName, price, quantity);
            itemCount++;
            System.out.println("Added " + itemName + " to the cart.");
        } else {
            System.out.println("Cart is full, cannot add more items.");
        }
    }

    // Method to remove an item from the cart by name
    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].getItemName().equalsIgnoreCase(itemName)) {
                // Shift items left to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null; // Remove the last item
                itemCount--;
                System.out.println("Removed " + itemName + " from the cart.");
                return;
            }
        }
        System.out.println(itemName + " not found in the cart.");
    }

    // Method to calculate the total cost of all items in the cart
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].getTotalCost();
        }
        return totalCost;
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        if (itemCount == 0) {
            System.out.println("The shopping cart is empty.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                cartItems[i].displayItemDetails();
            }
        }
    }

    // Main method to test the shopping cart
    public static void main(String[] args) {
        // Create an instance of the shopping cart system with a capacity of 5 items
        ShoppingCartSystem cart = new ShoppingCartSystem(5);

        // Add items to the cart
        cart.addItem("Laptop", 999.99, 1);
        cart.addItem("Smartphone", 499.99, 2);

        // Display the cart items
        System.out.println("\nItems in the cart:");
        cart.displayCartItems();

        // Display total cost of the cart
        System.out.println("\nTotal cost: $" + cart.getTotalCost());

        // Remove an item from the cart
        cart.removeItem("Smartphone");

        // Display updated cart items
        System.out.println("\nItems in the cart after removal:");
        cart.displayCartItems();

        // Display updated total cost
        System.out.println("\nUpdated total cost: $" + cart.getTotalCost());
    }
}

