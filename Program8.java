import java.util.*;

public class Program8 {
    public static void main(String args[]){
        System.out.println("*******Menu Driven Program for Arithmatic Operation*******");
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("\nEnter the second number: ");
        int num2 = sc.nextInt();

        int choice;

        System.out.print("\n1. Addition\n2. Subtraction\n3. Mutiply\n4. Division\n5. Remainder\n\nEnter your choice: ");

        choice = sc.nextInt();


        switch(choice)
        {
            case 1:
                System.out.println("\nAddition is: "+(num1+num2));
                break;
            case 2:
                System.out.println("\nSubstraction is: "+(num1-num2));
                break;
            case 3:
                System.out.println("\nMultiply is: "+(num1*num2));
                break;
            case 4:
                System.out.println("\nDivision is: "+(num1/num2));
                break;
            case 5:
                System.out.println("\nRemainder is: "+(num1%num2));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
