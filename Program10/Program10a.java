import java.util.*;

public class Program10a{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n;i++)
        {
            //Spaces
            for(int j = 1; j <= n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= i;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
            
        }
        sc.close();

    }
}