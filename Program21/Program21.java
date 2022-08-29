package Program21;
class Department{
    String d_name;
    int d_id;

    Department(String name){
        System.out.println("Hello from Department by "+name);
    }
}

class Student extends Department{
    String s_name;
    int roll_no;
    char gender;

    Student(String s_name,int roll_no,char gender)
    {
        super("Akshay");
        this.s_name = s_name;
        this.roll_no = roll_no;
        this.gender = gender;

    }
    void show()
    {
        System.out.println("Name: "+this.s_name);
        System.out.println("Roll No: "+this.roll_no);
        System.out.println("Gender: "+this.gender);
    }

}
public class Program21 {
    public static void main(String args[])
    {
        Student s1 = new Student("AKshay", 3, 'M');
        s1.show();
    }    
}
