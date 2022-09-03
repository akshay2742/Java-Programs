package Program24;
class Demo{
    private static void sum(int x)
    {
        System.out.println(x);
    }

    private static void sum(int x,int y)
    {
        System.out.println(x+y);
    }

    void access(int x,int y)
    {
        sum(x);
        sum(x,y);
    }
}

public class PrivateOverloading {
    public static void main(String args[])
    {
        Demo d1 = new Demo();
        d1.access(3, 4);
    }
}
