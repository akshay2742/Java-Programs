//Write a program to demonstrate Garbage Collection and finalize() method
package Program19;


class Demo
{
	Demo()
	{
		System.out.println("Object Created");
	}
	
	protected void finalize()
	{
		System.out.println("Object Destroyed");
	}
}

class Program19
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		
		
		System.out.println("d1 = null");
		d1 = null;
		System.gc();
		
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		System.out.println("d1=d2");
		d2=d3;
		System.gc();
		
		System.out.println("new Demo();");
		new Demo();
		System.gc();
	}
}