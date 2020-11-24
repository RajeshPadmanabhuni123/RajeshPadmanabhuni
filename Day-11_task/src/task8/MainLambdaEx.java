package task8;

public class MainLambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoStringPredicateEx p=((s1,s2)->s1.length()>s2.length()?s1:s2);
		String longest=p.betterString("Rajesh", "Krishna");
		System.out.println(longest+" "+" is longer");
		TwoStringPredicateEx.display();
		System.out.println(p.betterString("raj","rockzz")+" "+"is longer");
		
		EmployeeClassEx e1=new EmployeeClassEx();
		e1.setCarname("alto");
		e1.setCarprice(50000);
		EmployeeClassEx e3=new EmployeeClassEx();
		e3.setCarname("Duster");
		e3.setCarprice(60000);
		TwoElementPredicateEx c=((c1,c2)->((EmployeeClassEx)c1).getCarprice()>((EmployeeClassEx)c2).getCarprice()?c1:c2);
		System.out.println(c.betterElement(e1, e3));
		
		ElementsClassEx e2=new ElementsClassEx();
		e2.setEmpid(444);
		e2.setEmpname("krishna");
		e2.setEmpsalary(56000);
		
		TwoElementPredicateEx t=((c1,c2)->((ElementsClassEx) c1).getEmpsalary()>((ElementsClassEx) c2).getEmpsalary()?c1:c2);
		System.out.println(t.betterElement(e1, e2));
	}

}
