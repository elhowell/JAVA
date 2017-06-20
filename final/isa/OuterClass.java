
import java.util.Scanner;
public class OuterClass {
 public int Arithmetic(int x, int y, char operator)
    {       int res =0;
      switch(operator)
       {
         case '*': res= (x*y);break;        }
       return res;    } 
	public class InnerClass
	{	  public int Arithmetic(int x, int y, char operator)
        { 	      int res =0;
          switch(operator)
           {       case '+': res= (x+y);break; 
             case '-': res= (x-y);break; /          }
            return res;        }
		public void ArithmeticTutor()
		{	int x, y;
			System.out.println("Enter two integers");
			Scanner s = new Scanner(System.in);
			x = s.nextInt();
			y = s.nextInt();
			System.out.println("What operation you wish to perform");
			System.out.println("Enter + for addition\nEnter - for subtraction\nEnter * for multiplication\n");
			char op =   s.next().charAt(0);
			System.out.println("Guess the result of " + x + " " + op + " " + y + " ?");
			double guess = s.nextInt();
			int arithmetic=0;
		if(op=='*')	
		{			arithmetic=OuterClass.this.Arithmetic(x,y,op);		}
		else
			arithmetic=Arithmetic(x,y,op);
		//here we check if the answer and the guess are the same 
		if(arithmetic==guess)		{
			System.out.println("Your guess is correct!");		}
		else
			System.out.println("Sorry your guess is incorrect, the correct answer is: "
					+arithmetic);	} }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      OuterClass oc = new OuterClass();
      OuterClass.InnerClass in = oc.new InnerClass();
      in.ArithmeticTutor();	}  }
