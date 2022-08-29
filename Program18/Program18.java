package Program18;

class sum{
    static int a,b;

    static void calsum()
    {
        System.out.println("Sum: "+(a+b));
    }


}
public class Program18 {
    public static void main(String args[])
    {
        sum.a = 5;
        sum.b = 6;

        sum.calsum();
    }
}
