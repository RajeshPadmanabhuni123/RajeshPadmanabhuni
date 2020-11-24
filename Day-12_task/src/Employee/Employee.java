package Employee;

public class Employee {

	int empid;
	String empname;
	double empsalary;
	int empage;
	double empworkingyears;
	public Employee(int empid, String empname, double empsalary, int empage, double empworkingyears) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empage = empage;
		this.empworkingyears = empworkingyears;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e=(Employee)obj;
		return this.empid==e.empid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empage=" + empage
				+ ", empworkingyears=" + empworkingyears + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.empid;
	}
	public double getEmpworkingyears() {
		return empworkingyears;
	}
	
}
