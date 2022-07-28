import java.util.*;

public class Program9 {
    public static void main(String args[]){        
        Scanner sc = new Scanner(System.in);

        System.out.println("*******Program to Reverse the Number*******");
        System.out.print("\nEnter the number to reverse: ");

        int n = sc.nextInt();

        int result = 0;

        while(n!=0)
        {
            result = result*10 + (n%10) ;
            n=n/10;
        }

        System.out.println(result);
    }
}