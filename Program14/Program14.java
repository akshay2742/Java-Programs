class Person{
    String name;
    int age;

    int x,y;

    void talk(){
        System.out.println("My name is:"+this.name);
        System.out.println("My age is:"+this.age);
    }

    //setters
    void setters(int x, int y){
        this.x = x;
        this.y = y;
    }

    //getters
    int getters()
    {
        return x+y;
    }

    //Default Constructor

    Person(){
        this.name = "Captain America";
        this.age = 45;
        System.out.println("Hello from Default Constructor");
    }

    //Parametrized Constructor

    Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Hello from Parametrized Constructor");
    }
}
public class Program14 {
    public static void main(String args[]){
        Person obj = new Person();
        Person obj1 = new Person("Tony Stark",56);

        // Default Constructor
        obj.talk();

        //Parametrized Constructor
        obj1.talk();

        //setters
        obj.setters(3,4);

        int sum = obj.getters();

        System.out.println("Sum is:"+sum);
    }
}

 