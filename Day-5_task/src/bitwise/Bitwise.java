package bitwise;

public class Bitwise {

	public void and(int a,int b)
	{
		System.out.println("Bitwise And : "+(a&b));
	}
	public void or(int a,int b)
	{
		System.out.println("Bitwise OR : "+(a|b));
	}
	public void xor(int a,int b)
	{
		System.out.println("Bitwise XOR : "+(a^b));
	}
	public void compliment(int a)
	{
		System.out.println("Compliment :"+~a);
	}
}
