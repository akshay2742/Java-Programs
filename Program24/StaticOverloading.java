package Program24;
//Static Polymorphism

class Demo{
    static void sum(int x)
    {
        System.out.println("Sum: "+x);
    }

    static void sum(int x, int y)
    {
        System.out.println("Sum: "+(x+y));
    }
}
public class StaticOverloading {
    public static void main(String args[])
    {       
        Demo.sum(4);
        Demo.sum(5,6);
    }
}
