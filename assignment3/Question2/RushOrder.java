package uhd.Part2;
public class RushOrder extends Order   //rushorder class 
{
    protected int dDay;  //declare delivery day
        public RushOrder()  
    {
        super();
    }
    public RushOrder(int x)  
    {
        super();
        dDay = x;
    }
    
    @Override
    public int getTotal()  
    {  //get the total
      int tempTotal = super.getTotal();
        if (tempTotal == 0)  { //check tempTotal
            return 0;
        }
           if (orderItems.size() < 4)    
        {
            switch(dDay)  //switch case for delivery day
            {
            case 1:  
                tempTotal += 25; break;
            case 2:
                tempTotal += 15; break;
            case 3:
                tempTotal += 10; break;
            default:
                break;
            } //end switch
        } //end if
        return tempTotal;   }
