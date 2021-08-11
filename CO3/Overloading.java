//Java program to find the area of different shapes using method overloading
class Square 
{
    void Area(double a)
    {
        System.out.println("Area of the Square: "+ a * a);
    }
}
class Circle 
{
  
    void Area(double r)
    {
        double A = Math.PI * r * r;
  
        System.out.println("The area of the circle is :" + String.format("%.2f", A));
    }
}
class Rectangle 
{
    void Area(double l, double w)
    {
        System.out.println("Area of the rectangle: " + l * w);
    }
}
public class Overloading
{
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        obj.Area(20,12);
        Circle obj1 = new Circle();
        obj1.Area(5);
        Square obj2 = new Square();
        obj2.Area(10);
    }
}