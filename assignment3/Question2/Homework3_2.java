package Question2;
import java.util.Scanner;
import java.util.Random;
public class Homework3_2 {

        public static void main(String[] args)
        {                    Scanner reader = new Scanner(System.in);
        Random rn = new Random();
         Order[] orders = new Order[4];
        OrderItem temp;
        String u;
        int a, b, c, grandTotal;  // vars for calculating grand total
        orders[0] = new Order();    //cases for executing switch
        orders[1] = new RushOrder(1);
        orders[2] = new RushOrder(2);
        orders[3] = new RushOrder(3);
              
        do {
            u = "";
            a = b = c = 0;  //total
            System.out.print("Enter UPC: ");
            
            u = reader.nextLine();
            if (!u.equals("Complete"))
            {
                System.out.print("Enter Quantity: ");
                a = reader.nextInt();
                b = rn.nextInt(100-50) + 51;
                c = rn.nextInt(8-1) + 1;
                temp = new OrderItem(a, b, c); 
             
                switch(c)   
                {
                    case(1):
                        orders[1].addOrderItem(temp); break;

                    case (2):
                        orders[2].addOrderItem(temp); break;

                    case (3):
                        orders[3].addOrderItem(temp); break;

                    default:
                        orders[0].addOrderItem(temp); break;
                    }
                reader.nextLine();
            }
        } while (!u.equals("Done"));
        grandTotal = 0; //set grand total with 0

        System.out.println();
        for (int x = 0; x < 4; x++) 
        {
            System.out.println("Order: " + (x+1));
            orders[x].printOrderItems();
            System.out.println("Order: " + (x+1) + " Cost: $" + orders[x].getTotal());
            System.out.println();
            grandTotal += orders[x].getTotal();
        } //end loop
        System.out.println("Total Cost: $" + grandTotal);  //out put grand total

        }
}
