package customer;

public class Customer implements Comparable{

	long accno;
	String cname;
	String cid;
	String address;
	public Customer(long accno, String cname, String cid, String address) {
		super();
		this.accno = accno;
		this.cname = cname;
		this.cid = cid;
		this.address = address;
	}
	@Override
	public int compareTo(Object o) {
		Customer c=(Customer)o;
		if(this.accno<c.accno)
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
