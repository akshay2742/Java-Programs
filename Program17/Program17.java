package Program17;

class Person{
    String name;
    int age;
    char gender;

    //Implementation of this Keyword
    Person(int age, String name, char gender)
    {
        this.age = age;
        this.name = name;
        this.gender = gender;        
    }
    
    void show()
    {
        System.out.println("Person Age: "+age);
        System.out.println("Person Name: "+name);
        System.out.println("Person Gender: "+gender);
    }
}
public class Program17 {

    public static void main(String args[])
    {
        Person p1 = new Person(21,"Akshay",'M');
        p1.show();
    }
    
}
