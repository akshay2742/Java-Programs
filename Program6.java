import java.util.*;

public class Program6 {
    public static void main(String args[])
    {
        System.out.println("*******Program to Check the Number is +ve, -ve & 0*******");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number: ");
        int n = sc.nextInt();
        
        // Using if only

        if(n == 0)
            System.out.print("\nNumber is Zero");
        
        if(n > 0)
            System.out.print("\nNumber is Positive");
        
        if(n < 0)
            System.out.print("\nNumber is Negative");

        // Using if else statement

        if(n == 0)
            System.out.println("\n\nNumber is Zero");
        else if(n > 0)
            System.out.println("\n\nNumber is Positive");
        else
            System.out.println("\n\nNumber is Negative");
    }
    
}
