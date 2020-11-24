package task3;
import java.util.Scanner;
public class University {

	String uname;
	String uaddress;
	String ucode;
	public University()
	{
		
	}
	class Electronics{
		String elccode;
		public void vision()
		{
			System.out.println("Glad to Be an Electronic engineer");
		}
	}
	static class Electrical{
		static String elecode;
		public static void vision()
		{
			System.out.println("Glad to Be an Electrical engineer");
		}
	}
	class ComputerScience{
		String cscode;
		public void vision()
		{
			System.out.println("Glad to Be an Computer Science engineer");
		}
	}
	public void Mechnical()
	{
		class Mechanical{
			String mcode="U404";
			public void vision()
			{
				System.out.println("Glad to Be an Mechnical engineer");
			}
		}
		Mechanical m=new Mechanical();
		System.out.println("Mechanical Branch code "+m.mcode);
		m.vision();
	}
	
}
