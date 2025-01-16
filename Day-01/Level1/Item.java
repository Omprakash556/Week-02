import java.util.Scanner;

public class Item {
    String itemCode;
    String itemName;
    double price;

    int quantity;

    public Item(String itemCode, String itemName, double price,  int quantity){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayResults(){
        System.out.println("itemCode of this Item: "+itemCode);
        System.out.println("itemName of this Item: "+itemName);
        System.out.println("Total Cost of Item is: "+price*quantity);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter itemCode of an Item: ");
        String itemCode = input.nextLine();

        System.out.println("Please enter itemName of an Item: ");
        String itemName = input.nextLine();

        System.out.println("Please enter Quantity of an Item: ");
        int quantity = input.nextInt();

        System.out.println("Please enter price of an Item: ");
        double price = input.nextDouble();

       Item item = new Item(itemCode, itemName,  price, quantity);
       item.displayResults();


    }
}
