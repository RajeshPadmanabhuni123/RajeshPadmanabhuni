package customer;

public class Customer1 implements Comparable{

	long accno;
	String cname;
	String cid;
	String address;
	public Customer1(long accno, String cname, String cid, String address) {
		super();
		this.accno = accno;
		this.cname = cname;
		this.cid = cid;
		this.address = address;
	}
	@Override
	public int compareTo(Object o) {
		Customer1 c=(Customer1)o;
		if((this.cname.toLowerCase().compareTo(c.cname.toLowerCase()))<0)
		{
			return -1;
		}
		else
			return 1;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return accno+" "+cname+" "+cid+" "+address;
	}
	

}
