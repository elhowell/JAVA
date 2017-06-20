package Question1;
public class Homework3_1 
{
        public static void main(String[] args)
        {
                Point newPoint = new Point(5, 15);

        Circle newCircle = new Circle(newPoint.x, newPoint.y, 10);

        System.out.println("Area of Circle: " + newCircle.area());

        Cylinder newCylinder = new Cylinder(newCircle.x, newCircle.y, newCircle.radius, 20);
		System.out.println("Object has a radius of 10 and height of 20.");
        System.out.println("Area of Cylinder:" + newCylinder.area());

        System.out.println("Volume of Cylinder: " + newCylinder.volume());
        }
}
