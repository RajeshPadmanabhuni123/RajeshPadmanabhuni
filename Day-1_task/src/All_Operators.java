import java.util.Scanner;

public class All_Operators {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=name.nextInt();
		int n2=name.nextInt();
		name.close();
		System.out.println("Arithmetic Operators");
		System.out.println("Addition of "+n1+" "+n2+" is "+(n1+n2));
		System.out.println("Subtraction of "+n1+" "+n2+" is "+(n1-n2));
		System.out.println("Multiplication of "+n1+" "+n2+" is "+(n1*n2));
		System.out.println("Division of "+n1+" "+n2+" is "+(n1/n2));
		System.out.println("Modulo-Division of "+n1+" "+n2+" is "+(n1%n2));
		System.out.println();
		System.out.println();
		System.out.println("Relational Operators");
		System.out.println(n1+" Greater than "+n2+" "+(n1>n2));
		System.out.println(n1+" Less than "+n2+" "+(n1<n2));
		System.out.println(n1+" Greater than or equal to "+n2+" "+(n1>=n2));
		System.out.println(n1+" Less than or equal to "+n2+" "+(n1<=n2));
		System.out.println(n1+" Equal to "+n2+" "+(n1==n2));
		System.out.println(n1+" Not Equal to "+n2+" "+(n1!=n2));
		System.out.println();
		System.out.println();
		System.out.println("Logical Operators");
		System.out.println("Logical AND for "+n1+" "+n2+" is "+(n1>0 && n2<0));
		System.out.println("Logical OR for "+n1+" "+n2+" is "+(n1>0 || n2<0));
		System.out.println("logical XOR for "+n1+" "+n2+" is "+(n1 ^ n2));
		System.out.println();
		System.out.println();
		System.out.println("Bitwise Operators");
		System.out.println("Bitwise And for "+n1+" "+n2+" is "+(n1&n2));
		System.out.println("Bitwise OR for "+n1+" "+n2+" is "+(n1|n2));
		System.out.println("Negation or Compliment for "+n1+" and "+n2+" is "+ ~n1 +" and "+ ~n2);
		System.out.println("Right Shift of "+n1+" by 1"+" is "+ (n1>>1));
		System.out.println("Left Shift of "+n1+" by 1"+" is "+ (n1<<1));
		System.out.println("Ternary Operator");
		System.out.println("greater of "+n1+" and "+n2+" by using ternary "+" is "+((n1>n2)?n1:n2));
		System.out.println();
		System.out.println();
		System.out.println("pre increment of n1 "+ (++n1));
		System.out.println("post increment of n2 "+(n2++));
		System.out.println();
		System.out.println();
		System.out.println("Arithmetic with assignment operator");
		System.out.print("Addition of "+n1+" "+n2+" is ");
		n1+=n2;
		System.out.println(n1);
		System.out.print("Subtraction of "+n1+" "+n2+" is ");
		n1-=n2;
		System.out.println(n1);
		System.out.print("Multiplication of "+n1+" "+n2+" is ");
		n1*=n2;
		System.out.println(n1);
		System.out.print("Division of "+n1+" "+n2+" is ");
		n1/=n2;
		System.out.println(n1);
		System.out.print("Modulo-Division of "+n1+" "+n2+" is ");
		n1%=n2;
		System.out.println(n1);
	}

}
