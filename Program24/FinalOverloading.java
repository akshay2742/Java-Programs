package Program24;
class Demo{
    final void sum(int x)
    {
        System.out.println("Sum: "+x);
    }

    final void sum(int x, int y)
    {
        System.out.println("Sum: "+(x+y));
    }
}

public class FinalOverloading {
    public static void main(String args[])
    {
        Demo d1 = new Demo();
        d1.sum(4);
        d1.sum(4,5);
    }
}
