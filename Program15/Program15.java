class Student
{   
    //Method Variables
    int roll_no = 1;
    String name = "Shyam";
    int marks = 98;

    //Instance Method 
    void show()
    {
        System.out.println("Student Roll No: "+roll_no);
        System.out.println("Student Name: "+name);
        System.out.println("Student Marks: "+marks);
    }

}

public class Program15{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.show();
    }
}