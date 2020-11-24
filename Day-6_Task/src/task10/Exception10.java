package task10;

public class Exception10 {

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
		Exception10 el=new Exception10();
		el=null;
		System.out.println(el.getClass());
		
	}
}

