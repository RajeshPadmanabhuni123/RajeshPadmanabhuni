package co.threads;

public class Thread1 extends Thread 
{
	Rajesh r=new Rajesh();
	@Override
	public void run()
	{
		for(int i=1;i<26;i++)
		{
			r.eat();
		}
	}
}
class Thread2 extends Thread
{
	Rajesh r=new Rajesh();
	@Override
	public void run()
	{
		for(int i=26;i<51;i++)
		{
			r.run();
			/*try
			{
				Thread.sleep(4000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}*/
		}
	}
}
class Rajesh 
{
	public void run()
	{
		System.out.println("Run Rajesh Run");
	}
	public void eat()
	{
		System.out.println("Eat Rajesh Eat");
	}
	
}