package co.threads;

public class Runnable1 implements Runnable {
	Rajesh1 r=new Rajesh1();
	@Override
	public void run()
	{
		for(int i=51;i<76;i++)
		{
			r.kick();
		}
	}

}
class Runnable2 implements Runnable {
	Rajesh1 r=new Rajesh1();
	@Override
	public void run()
	{
		for(int i=76;i<101;i++)
		{
			r.walk();
			try
			{
				Thread.sleep(4000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
class Rajesh1
{
	public void walk()
	{
		System.out.println("Walk Rajesh Walk");
	}
	public void kick()
	{
		System.out.println("Kick Rajesh Kick");
	}
	
}