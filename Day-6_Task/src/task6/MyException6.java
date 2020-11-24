package task6;

public class MyException6 extends Exception {

	String message;
	public void toStringE()
	{
		System.out.println(this.message);
	}
	public MyException6(String message)
	{
		this.message=message;
		toStringE();
	}
}
