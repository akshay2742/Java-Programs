package Program23;
class Sample{
    void sum(int x){
        System.out.println("Sum from Sample: "+x);
    }
}

class Demo extends Sample{
    void sum(int x)
    {
        System.out.println("Sum from Demo: "+x);
    }
}

public class DynamicOverridding {
    public static void main(String args[])
    {
        Demo d1 = new Demo();

        d1.sum(3);
    }
}
