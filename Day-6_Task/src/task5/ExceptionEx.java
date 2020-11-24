package task5;

public class ExceptionEx extends MyExecption{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyExecption el;
		try
		{
			System.out.println(9/0);
		}
		catch(Exception e)
		{
			el=new MyExecption(e);
		}
	}

}
