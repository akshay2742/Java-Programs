import java.util.*;

public class Program4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();

        System.out.print("Area of the circle is: "+(3.14*radius*radius));
        sc.close();
    }
}
