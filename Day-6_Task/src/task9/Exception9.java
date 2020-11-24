package task9;

public class Exception9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
	}
	public static void f()
	{
		try
		{
			g();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void g() throws Exception
	{
		System.out.println(9/0);
	}
}
