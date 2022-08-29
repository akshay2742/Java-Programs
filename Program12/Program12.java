import java.io.*;

public class Program12 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of elements in the array: ");

        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the "+i+"th"+" element: ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Array before sorting: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\nArray after sorting: ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
