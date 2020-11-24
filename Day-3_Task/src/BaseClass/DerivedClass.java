package BaseClass;
import java.util.Scanner;

/*extends Derived class*/
public class DerivedClass extends BaseClass {
	public static void dispMax(int a,int b)
	{
		int c=(a>b)?a:b;
		System.out.println("maximum number is"+c );
	}
	public static void dispMin(int a,int b)
	{
		int c=(a<b)?a:b;
		System.out.println("minimum number is"+c );
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");//inputs will be taken in base class
		DerivedClass d=new DerivedClass();
		DerivedClass.dispMax(d.num1, d.num2);//calling method to find max
		DerivedClass.dispMin(d.num1, d.num2);//calling method to find min
		
	}
}
