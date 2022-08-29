import java.util.*;

public class Program7 {
    public static void main(String args[]){
        System.out.println("*******Program to Check the Number is Even & Odd*******");
        System.out.print("\nEnter the number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0)
            System.out.print("Number is even!");
        else    
            System.out.print("Number is odd!");
        
        sc.close();
    }
}
