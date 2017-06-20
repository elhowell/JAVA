package uhd.Part2;
import java.util.ArrayList;

class Order{
   protected ArrayList<OrderItem> orderItems;
    public Order() {
        this.orderItems = new ArrayList<OrderItem>();  //create new arraylist
    }
    public Boolean addOrderItem(OrderItem item)     //check and add order item
    {
            orderItems.add(item);
            return true;
    }
    public int getTotal()  //get the total
    {
        int total = 0;
        for(OrderItem o : orderItems){
            total = total + o.getCost();
        }
        return total;    }
    public void printOrderItems() //output the order items
    {
        for(OrderItem o : orderItems){
            System.out.println(o.toString());
        }    }}
