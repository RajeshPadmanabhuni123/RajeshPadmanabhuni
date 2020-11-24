package task8;

public class Exception8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception8 e=new Exception8();
		e=null;
		try
		{
			e.getClass();
		}
		catch(Exception el)
		{
			System.out.println(el);
		}
	}

}
