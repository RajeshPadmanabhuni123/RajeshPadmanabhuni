package task2;
class Result
{
	static int result=0;
}
public class Cars extends Thread {
	
	@Override
	public void run() 
	{
		int count=0;
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			count++;
			if(i==6)
			{
				//Result.result++;
				//System.out.println("Thread1 reached petrol bunk");
				System.out.println("Thread1 is in "+(++Result.result)+"position");
			}
		}
	}
}

class Cars2 extends Thread {
	@Override
	public void run() 
	{
		int count=0;
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			count++;
			if(i==6)
			{
				
				//Result.result++;
				//System.out.println("Thread2 reached petrol bunk");
				System.out.println("Thread2 is in "+(++Result.result)+"position");
			}
		}
	}
	
}
class Cars3 extends Thread {
	
	@Override
	public void run() 
	{
		int count=0;
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			count++;
			if(i==6)
			{
				//Result.result++;				
				//System.out.println("Thread3 reached petrol bunk");
				System.out.println("Thread3 is in "+(++Result.result)+"position");
			}
		}
	}
	
}
class Cars4 extends Thread {
	
	@Override
	public void run() 
	{
		int count=0;
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			count++;
			if(i==6)
			{

			 //Result.result++;
				//System.out.println("Thread4 reached petrol bunk");

				System.out.println("Thread4 is in "+(++Result.result)+"position");
			}
		}
	}
}

class Cars5 extends Thread {
	
	@Override
	public void run() 
	{
		int count=0;
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			count++;
			if(i==6)
			{
				//Result.result++;
				//System.out.println("Thread5 reached petrol bunk");

				System.out.println("Thread5 is in "+(++Result.result)+"position");
			}
		}
	}
	
}
class Cars6 extends Thread 
{
	@Override
	public void run() 
	{
		int count=0;
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			count++;
			if(i==6)
			{
				//Result.result++;
				//System.out.println("Thread6 reached petrol bunk");

				System.out.println("Thread6 is in "+(++Result.result)+"position");
			}
		}
	}
}
