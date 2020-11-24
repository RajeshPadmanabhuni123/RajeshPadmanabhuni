import java.util.Scanner;
public class Arithmetic_2D {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int size1r,size2r,size1c,size2c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array1 row");
		size1r=sc.nextInt(); //Size of Array1
		System.out.println("Enter the size of Array1 col");
		size1c=sc.nextInt(); //Size of Array1
		
		System.out.println("Enter the size of Array2 row");
		size2r=sc.nextInt(); //Size of Array2
		System.out.println("Enter the size of Array2 col");
		size2c=sc.nextInt(); //Size of Array2
		
		//declaring Arrays
		int a[][]=new int[size1r][size1c];
		int b[][]=new int[size2r][size2c];
		
		//initialzing Array1
		System.out.println("Enter elements in Array1");
		for(int i=0;i<size1r;i++)
		{
			for(int j=0;j<size1c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		//Initializing Array2
		System.out.println("Enter elements in Array2");
		for(int i=0;i<size2r;i++)
		{
			for(int j=0;j<size2c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		Main_Arithmetic_2D m=new Main_Arithmetic_2D();
		if(size1r==size2r && size1c==size2c)
		{
			m.Addition(a, b,size1r,size1c);
			m.subtraction(a,b,size1r,size1c);
		}
		else
		{
			System.out.println("Addition and Subtraction Cant be done...!!");
		}
		if(size1c==size2r)
		{
			m.multiplication(a,b,size1r,size1c);
		}
		else
		{
			System.out.println("Multiplication Cant be done...!!");
		}
		sc.close();

	}

}
