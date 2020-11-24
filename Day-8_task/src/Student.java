
public class Student {
	String sname;
	String sdob;
	int s1,s2,s3;
	public Student(String sname, String sdob, int s1, int s2, int s3) {
		super();
		this.sname = sname;
		this.sdob = sdob;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public int total(int s1,int s2,int s3)
	{
		return (s1+s2+s3);
	}
	public float average(int s1,int s2,int s3)
	{
		return (float)(s1+s2+s3)/3;
		
	}
	
}
