//Abstract class
abstract class Car{
    int reg_no;

    Car(int reg_no)
    {
        this.reg_no = reg_no;
    }

    //abstract method
    abstract void steering();
    abstract void braking();
}

class Maruti extends Car{

    Maruti()
    {
        super(6);
    }

    void steering()
    {
        System.out.println("Manual Braking");
    }

    void braking()
    {
        System.out.println("Drum Braking");
    }
}

class Hyundai extends Car
{
    Hyundai()
    {
        super(8);
    }

    void steering()
    {
        System.out.println("Power Steering");
    }

    void braking()
    {
        System.out.println("Disc Braking");
    }
}

//Main class
public class AbstractClass {
    public static void main(String args[])
    {
        Maruti m1 = new Maruti();
        m1.steering();
        m1.braking();

        Hyundai h1 = new Hyundai();
        h1.steering();
        h1.braking();
    }
}
