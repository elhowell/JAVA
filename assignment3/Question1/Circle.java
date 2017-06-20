
package Question1;
import java.lang.Math;
public class Circle extends Point{
    double radius;
      public Circle() 
    {      super();
        radius = 0;    }
    
    public Circle(int n, int m, double r)   
    {
        super(n,m);
        radius = r;    }
    
    public Circle(double r) 
    {
        super();
        radius = r;    }
    public double area()    
    {        return (Math.PI*radius*radius);    }}
