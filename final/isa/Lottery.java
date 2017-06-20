
import java.util.*;
public class Lottery {
	    private int[] ticket;
    public final int size = 8;  
    public void generateTicket()
    {
      /*
       * this method will generate random number in the range of 0 through 8	
    	(0 and 8 included) for each element in the ticket array
      */
    	Random rand= new Random();
    	    	for(int i=0; i<size; i++)
    	{
    		ticket[i]=rand.nextInt(9); 	}    	    }
    public Lottery()
    {
    	ticket = new int[size];
    	//call the method generateTicket() to initialize the ticket array
    	generateTicket();    }
        public int[] getTicket()
    {
      return ticket;    }
    public void ToString()
    {
     //displays the ticket as an integer
    	for(int i=0; i<0; i++)
    	{
    		System.out.print(ticket[i]);    	}
    	System.out.println();    }
   public void setTicket(int[] newTicket)
     {
    	for(int i=0; i<size; i++)
    	{
    		this.ticket[i]= newTicket[i];     	}
     }
    public boolean MatchTicket(int[] ticketDrawn)
    {    	boolean yes= true;
    	if(ticket.length==ticketDrawn.length)
    	{
    		for(int i=0; i<size; i++)
    		{ 			if(ticket[i]!=ticketDrawn[i])
    			{
    				yes= false;
    			}    		}    	}
    	else
    	{	yes=false;}
       return yes;    } }
