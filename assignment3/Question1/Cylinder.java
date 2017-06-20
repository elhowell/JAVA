
package Question1;
public class Cylinder extends Circle
{
    double height;
        public Cylinder()   
    {
        super();
        radius = 0;
        height = 0;    }
        public Cylinder(int a, int b, double r, double h)   
    {
        super(a, b, r);
        height = h;    }
      public Cylinder(double r, double h) 
    {
        radius = r;
        height = h;       }
       public double volume()  
    {
        return (Math.PI*radius*radius*height);    }
       public double area()    
    {
        return (2*Math.PI*radius*height+2*Math.PI*radius*radius);    }}
