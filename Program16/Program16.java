class Student{
    int roll_no;
    String name;

    Student(int roll_no,String name)
    {
        this.name = name;
        this.roll_no = roll_no;
    }
}

public class Program16{
    public static void main(String args[])
    {
        Student s1 = new Student(1,"Akshay");
        Student s2 = new Student(2,"Ram");
        System.out.print("Student Roll No of Object 1: "+s1.roll_no);
        System.out.print("\nStudent Name of Object 1: "+s1.name);
        System.out.print("\nStudent Roll No of Object 2: "+s2.roll_no);
        System.out.print("\nStudent Name of Object 2: "+s2.name);
    }
}