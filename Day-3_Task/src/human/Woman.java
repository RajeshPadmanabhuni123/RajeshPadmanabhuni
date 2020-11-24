package human;

/*Derived class*/
class Woman extends Human{

	int age;
	public Woman(int age, String name,String gender)
	{
		super(name,gender);
		this.age=age;
	}
}