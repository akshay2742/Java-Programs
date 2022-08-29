package Program20;
class University{
    int Affiliated_no;
    String uni_name;
}

class Student extends University{    
    int roll_no;
    String stu_name;
    int marks;

    void display(){
        System.out.println("Affiliation No: "+this.Affiliated_no);
        System.out.println("University Name: "+this.uni_name);
        System.out.println("Roll No: "+this.roll_no);
        System.out.println("Student Name: "+this.stu_name);
        System.out.println("Marks: "+this.marks+"\n");
    }
}

class Professor extends University{
    int teacher_id;
    int salary;
    int age;

    void display()
    {
        System.out.println("Affiliation No: "+this.Affiliated_no);
        System.out.println("University Name: "+this.uni_name);
        System.out.println("Teacher ID: "+this.teacher_id);
        System.out.println("Salary of Teacher: "+this.salary);
        System.out.println("Age of the Teacher: "+this.age+"\n");
    }
}


public class Program20{
    public static void main(String args[])
    {
        //Student Class
        Student s1 = new Student();

        //Professor Class
        Professor p1 = new Professor();

        s1.Affiliated_no = 123456;
        s1.uni_name = "NIT RAIPUR";
        s1.roll_no = 1;
        s1.stu_name = "Akshay Sharma";
        s1.marks = 12;

        System.out.println("Student Class Extends University\n");
        s1.display();

        p1.Affiliated_no = 789456;
        p1.uni_name = "NIT RAIPUR";
        p1.teacher_id = 454;
        p1.age = 35;
        p1.salary = 500000;

        System.out.println("Professor Class Extends University\n");
        p1.display();

    }
}
