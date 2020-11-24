package task3;

public class ThreadGroupEx {

	public static void main(String[] args) 
	{
		
		ThreadGroup t1=new ThreadGroup("Data Pirates");
		DataPirates d1=new DataPirates(t1,"rajesh");
		DataPirates d2=new DataPirates(t1,"Anusha");
		DataPirates d3=new DataPirates(t1,"keerthi");
		DataPirates d4=new DataPirates(t1,"Vishnu priya");
		DataPirates d5=new DataPirates(t1,"Keerthi");
		
		ThreadGroup t2=new ThreadGroup("TeamQuad");
		TeamQuad q1=new TeamQuad(t2,"one");
		TeamQuad q2=new TeamQuad(t2,"Two");
		TeamQuad q3=new TeamQuad(t2,"Three");
		TeamQuad q4=new TeamQuad(t2,"Four");
		TeamQuad q5=new TeamQuad(t2,"Five");
		
		ThreadGroup t3=new ThreadGroup("Velocity");
		Velocity v1=new Velocity(t3,"one");
		Velocity v2=new Velocity(t3,"Two");
		Velocity v3=new Velocity(t3,"Three");
		Velocity v4=new Velocity(t3,"Four");
		Velocity v5=new Velocity(t3,"Five");
		
		ThreadGroup t4=new ThreadGroup("JavaDalia");
		JavaDalia j1=new JavaDalia(t4,"one");
		JavaDalia j2=new JavaDalia(t4,"Two");
		JavaDalia j3=new JavaDalia(t4,"Three");
		JavaDalia j4=new JavaDalia(t4,"Four");
		JavaDalia j5=new JavaDalia(t4,"Five");
		
		d1.start();
		d2.start();
		d3.start();
		d4.start();
		q1.start();
		q2.start();
		q3.start();
		q4.start();
		v1.start();
		v2.start();
		v3.start();
		v4.start();
		j1.start();
		j2.start();
		j3.start();
		j4.start();
		int i=0;
		int d,v,j,q;
		
		
		
	}
	
}
