package Program22;
class Shape{
    public double length;
    public double breadth;
    public double side;
}

class Rectangle extends Shape{
    
    Rectangle(double a, double b)
    {
        this.length = a;
        this.breadth = b;
    }

    void area()
    {
        System.out.println("The area of the Rectangle is: "+(this.length*this.breadth));
    }
}

class Square extends Shape{

    Square(double a)
    {
        this.side = a;
    }

    void area()
    {
        System.out.println("The area of the Square is: "+(this.side*this.side));
    }
}

public class Program22 {

    public static void main(String args[])
    {
        Square s1 = new Square(4);
        Rectangle r1 = new Rectangle(3, 5);

        s1.area();
        r1.area();
    }
    
}
