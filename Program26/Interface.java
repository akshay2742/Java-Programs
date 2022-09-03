import java.lang.*;
import java.io.*;

interface Myinter
{
    void connect();
    void disconnect();
}

class OracleDB implements Myinter{
    public void connect()
    {
        System.out.println("Connected to Oracle");
    }

    public void disconnect()
    {
        System.out.println("Disconnected to Oracle");
    }
}

class Sybase implements Myinter{
    public void connect()
    {
        System.out.println("Connected to Sybase");
    }

    public void disconnect()
    {
        System.out.println("Disconnected to Sybase");
    }
}
public class Interface {
    public static void main(String args[]) throws Exception
    {
        try{
            Class c = Class.forName(args[0]);
            Myinter mi = (Myinter)c.newInstance();

            mi.connect();
            mi.disconnect();
        }
        catch(ClassNotFoundException e){
            System.out.println(e.toString());
        }
        
    }
}
