package Program24;
class Demo{
    final static void sum(int x)
    {
        System.out.println("Sum: "+x);
    }

    final static void sum(int x, int y)
    {
        System.out.println("Sum: "+(x+y));
    }
}

public class FinalOverloading {
    public static void main(String args[])
    {
        Demo.sum(4);
        Demo.sum(4,5);
    }
}
