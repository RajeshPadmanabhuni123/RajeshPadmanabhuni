package human;

/*Derived Class*/
class Man extends Human{

	int age;
	public Man(int age, String name,String gender)
	{
		super(name,gender);
		this.age=age;
	}
}