package task3;

class Result
{
	static int result=0;
}
public class DataPirates extends Thread {
	static int count=0;
	public DataPirates(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
			count++;
			if(count==4)
			{

			 //Result.result++;
				//System.out.println("Thread4 reached petrol bunk");

				System.out.println("DataPirates is in "+(++Result.result)+"position");
			}
	}
}

class TeamQuad extends Thread {
	static int count=0;
	public TeamQuad(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() 
	{
		
		// TODO Auto-generated method stub
			count++;
			if(count==4)
			{

			 //Result.result++;
				//System.out.println("Thread4 reached petrol bunk");

				System.out.println("TeamQuad is in "+(++Result.result)+"position");
			}
	}
	
}
class Velocity extends Thread {
	static int count=0;
	public Velocity(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
			count++;
			if(count==4)
			{

			 //Result.result++;
				//System.out.println("Thread4 reached petrol bunk");

				System.out.println("Velocity is in "+(++Result.result)+"position");
			}
	}
	
}
class JavaDalia extends Thread {
	static int count=0;
	ThreadGroup t4;
	public JavaDalia(ThreadGroup group, String name) {
		super(group, name);
		this.t4=group;
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
			count++;
			if(count==4)
			{

			 //Result.result++;
				//System.out.println("Thread4 reached petrol bunk");

				System.out.println("JavaDalia is in "+(++Result.result)+"position");
			}
	}
}
