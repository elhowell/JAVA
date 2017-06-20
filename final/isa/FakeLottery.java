
import java.util.Random;
public class FakeLottery extends Lottery {
    
	   public FakeLottery()
	     {
		  super();
	     }
			    public void generateTicket()
	    {
	    	int [] temp= new int[size];
	    	/*
	       * this method will 
	        1. generate random number in the range of 0 through 8	
	    	    (0 and 8 included) for the first 4 elements in the inherited ticket array
	    	 2. generate random number in the range of 0 through 4	
	    	    (0 and 4 included) for the remaining elements in the inherited ticket array
	      */
	    	Random rand= new Random();
	    		    	for (int i= 0; i<size; i++ )
	    	{
	    		if(i<4)
	    		{
	    			temp[i]=rand.nextInt(9);	    		}
	    		else
	    		{
	    			rand.nextInt(5);
	    			temp[i]=rand.nextInt(5);	    		}	    	}
	    	setTicket(temp);
	    }
	    
				public static void main(String[] args) 
		{
		
		}	}
