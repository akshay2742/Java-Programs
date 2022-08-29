package Program23;
class Sample{
    void sum(int x)
    {
        System.out.println("Sum: "+x);
    }

    void sum(int x,int y)
    {
        System.out.println("Sum: "+(x+y));
    }
}

public class DynamicOverloading{
    public static void main(String args[])
    {
        Sample s1= new Sample();
        s1.sum(2);
        s1.sum(2,3);
    }
}