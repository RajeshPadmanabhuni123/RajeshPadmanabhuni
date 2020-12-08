package com.src;

public class Customer {

	private int custid;
	private String custname;
	private long custmob;
	private String custdob;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public long getCustmob() {
		return custmob;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custmob=" + custmob + ", custdob=" + custdob
				+ "]";
	}
	public void setCustmob(long custmob) {
		this.custmob = custmob;
	}
	public String getCustdob() {
		return custdob;
	}
	public void setCustdob(String custdob) {
		this.custdob = custdob;
	}
	
	
}
