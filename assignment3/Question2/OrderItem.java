package uhd.Part2;
class orderItem{
   private String upc;
    private int quantity;
    private int price;
    public orderItem(String upc, int quantity, int price)   //order Items
    {
        this.upc = upc;
        this.quantity = quantity;
        this.price = price;    }
    public orderItem()  
    {
        upc = "";
        quantity =0;
        price = 0;    }

    public int getCost()  //returns the cost, q*p
    {
        return quantity*price;    }

    @Override
    public String toString()   
    {
        return "orderItem{" +
                "UPC='" + upc + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';    } }
