package task1;

public class Thread1 extends Thread implements Cloneable
{
	public Object clone()
	{
		Thread1 t1=new Thread1();
			return t1;
	}
	@Override
	public void run()
	{
		System.out.println("Thread1");
	}
}
class Thread2 extends Thread
{
	
	@Override
	public void run()
	{
		System.out.println("Thread2");
	}
}