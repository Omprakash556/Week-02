
class Order{
    int orderID;
    String orderDate;

    Order(int orderID, String orderDate){
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    void getOrderStatus(){
        System.out.println("OrderID: "+orderID);
        System.out.println("Order Date: "+orderDate);
    }
}

class ShippedOrder extends Order{
    int trackingOrder;
    ShippedOrder(int orderID, String orderDate,int trackingOrder){
        super(orderID, orderDate);
        this.trackingOrder = trackingOrder;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Order: "+trackingOrder);
    }
}
class DeliveredOrder extends ShippedOrder{
    String deliveryDate ;
    DeliveredOrder(int orderID, String orderDate,int trackingOrder, String deliveryDate){
        super(orderID, orderDate,trackingOrder);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: "+deliveryDate);
    }
}

// Main class
public class OrderManagement {
    // Main Method
    public static void main(String[] args) {

        Order order = new Order(101, "12/01/2025");
        order.getOrderStatus();
        System.out.println();

        DeliveredOrder deliveredOrder = new DeliveredOrder(102, "12/01/2025",1,"22/01/2025");
        deliveredOrder.getOrderStatus();
        System.out.println();

        ShippedOrder shippedOrder = new DeliveredOrder(103, "13/01/2025",1, "23/01/2015");
        shippedOrder.getOrderStatus();
        System.out.println();



    }
}
