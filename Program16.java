import java.io.*;

public class Program16 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the Number of rows: ");
        int row = Integer.parseInt(br.readLine());

        System.out.print("Enter the Number of columns: ");
        int col = Integer.parseInt(br.readLine());
        
        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        
        System.out.print("\nEnter Values for Matrix 1\n\n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("Enter the "+i+"*"+j+"th element: ");        
                matrix1[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("\n******Matrix1******");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("Enter Values for Matrix 2\n\n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("Enter the "+i+"*"+j+"th element: ");        
                matrix2[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("\n******Matrix2******");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.print("\nSum of both the matrices is:\n");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(matrix1[i][j]+matrix2[i][j]+ " ");
            }
            System.out.println();
        }



    }
}
