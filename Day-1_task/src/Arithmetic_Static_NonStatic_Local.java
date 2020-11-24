import java.util.Scanner;
public class Arithmetic_Static_NonStatic_Local {
	static int n1;
	int n2;
	
public static void main(String[] args) {
	
	int ans;
	Scanner name = new Scanner(System.in);
	Arithmetic_Static_NonStatic_Local cs = new Arithmetic_Static_NonStatic_Local();
	System.out.println("Enter two numbers ");
	n1=name.nextInt();
	cs.n2=name.nextInt();
	ans=n1+cs.n2;
	System.out.println("Addition : "+ans);
	ans=n1-cs.n2;
	System.out.println("Subtraction : "+ans);
	ans=n1*cs.n2;
	System.out.println("Multiplication : "+ans);
	ans=n1/cs.n2;
	System.out.println("Division : "+ans);
	ans=n1%cs.n2;
	System.out.println("Modulo-Division : "+ans);
	name.close();
}
}
