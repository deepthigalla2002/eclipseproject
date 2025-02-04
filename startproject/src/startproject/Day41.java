package startproject;

class Demo111 extends Thread
{
	public void run()
	{
		try
		{
			Thread t=Thread.currentThread();
			
			System.out.println(t);
			System.out.println(t.getName());
			Thread.sleep(1000);
			
			
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
	}
}

class Demo112 extends Thread
{
	public void run()
	{
		try
		{
			Thread t=Thread.currentThread();
			
			System.out.println(t);
			System.out.println(t.getName());

			Thread.sleep(1000);
			
			
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
	}
}



public class Day41 {

	public static void main(String[] args) {
		
		Demo111 d1=new Demo111();
		Demo112 d2=new Demo112();
		d1.start();
		d2.start();
		
		
		try
		{
			Thread t=Thread.currentThread();
			
			System.out.println(t);
			System.out.println(t.getName());

			Thread.sleep(10000);
			
			
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
		
	}

}
