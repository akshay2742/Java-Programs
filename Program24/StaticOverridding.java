package Program24;

class Sample{
    static void sum(int x){
        System.out.println("Sum from Sample: "+x);
    }
}

class Demo extends Sample{
    static void sum(int x)
    {
        System.out.println("Sum from Demo: "+x);
    }
}

public class StaticOverridding {
    public static void main(String args[])
    {
        Demo.sum(3);
        Sample.sum(4);
    }
}

