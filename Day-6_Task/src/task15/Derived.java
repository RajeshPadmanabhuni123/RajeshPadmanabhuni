package task15;

public class Derived extends Exception15{

	Derived() throws CloneNotSupportedException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Derived d= new Derived();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}
