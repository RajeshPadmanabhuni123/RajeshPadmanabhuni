import java.util.Scanner;
public class Throwable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] n={1,2,3,4,5};
		int a=10;
		int b=0;
		Exception ex=new Exception();
		try
		{
		int c=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getSuppressed());
		}
		try
		{
			System.out.println(9/0);
		}
		catch(ArithmeticException e)
		{
			ex.addSuppressed(new ArithmeticException());
			System.out.println(ex.getSuppressed());
		}
	}

}
