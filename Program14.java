import java.io.*;

public class Program14 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the Id of the Employee ");
        int id = Integer.parseInt(br.readLine());
        
        System.out.print("Enter the Name of the Employee: ");
        String name = br.readLine();

        System.out.print("Enter the Gender of the Employee: ");
        char gender = (char)br.read();

        br.skip(2);

        System.out.print("Enter the Salary of the Employee: ");
        float salary = Float.parseFloat(br.readLine());

        System.out.println("\n\nId of the Employee: "+id+"\nName of the Employee: "+name+"\nGender of the Employee: "+gender+"\nSalary of the Empoyee: "+salary);
    }
}
