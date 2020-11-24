package task12;

public class Exception12 {
	public static void main(String[] args) {
		
		int[] a=new int[5];
		try 
		{
			System.out.println(a[6]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
