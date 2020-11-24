package task3;
import java.util.Scanner;
public class Main_University {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University e=new University();
		Scanner sc = new Scanner(System.in);
		//university details input
		System.out.println("Enter university name");
		e.uname=sc.next();
		System.out.println("Enter university address");
		e.uaddress=sc.next();
		System.out.println("Enter university code");
		e.ucode=sc.next();
		
		
		//Electronics branch input
		University.Electronics el= e.new Electronics();
		System.out.println("Enter Electronics branch code");
		el.elccode=sc.next();
		
		
		//Electrical branch input
		System.out.println("Enter Electrical branch code");
		University.Electrical.elecode=sc.next();
		
		
		//Computer Science branch input
		University.ComputerScience cs= e.new ComputerScience();
		System.out.println("Enter Computer Science branch code");
		cs.cscode=sc.next();
			
		
		//university Details
		System.out.println("University name "+e.uname);
		System.out.println("University address "+e.uaddress);
		System.out.println("University code "+e.ucode);
		
		//Electronics branch Details
		System.out.println("Electronics Branch"+el.elccode);
		el.vision();
		
		//Electrical branch Details
		System.out.println("Electrical Branch"+University.Electrical.elecode);
		University.Electrical.vision();
				
		//Computer Science branch Details
		System.out.println("Computer Science Branch"+cs.cscode);
		cs.vision();
		
		//Mechanical branch Details
		e.Mechnical();
				
				
	}

}
