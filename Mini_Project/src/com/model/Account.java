package com.model;

import com.service.Bank;

public abstract class Account implements Bank{

	public String bankName;
	double roi;
	private String name;
	private int custid;
	private String emailid;
	private long mobileno;
	private String address;
	private long accno;
	public static long amount;
	public String type;
	
	
	public Account(String name, int custid, String emailid, long mobileno, String address, long accno) {
		this.name = name;
		this.custid = custid;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.address = address;
		this.accno = accno;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}
	
	public String getType() {
		return type;
	}
	public String getBankName() {
		return bankName;
	}
	public double getRoi() {
		return roi;
	}
	public String getName() {
		return name;
	}
	public int getCustid() {
		return custid;
	}
	public String getEmailid() {
		return emailid;
	}
	public long getMobileno() {
		return mobileno;
	}
	public String getAddress() {
		return address;
	}
	public long getAccno() {
		return accno;
	}
	@Override
	public String toString() {
		return "CurrentAccount [name=" + name + ", custid=" + custid + ", emailid=" + emailid + ", mobileno=" + mobileno
				+ ", address=" + address + ", accno=" + accno + "]";
	}
	@Override
	public void bankName(String bname) {
		// TODO Auto-generated method stub
		this.bankName=bname;
		switch(bname)
		{
			case "SBI":
			{
				roi(3.5);
				break;
			}
			case "Andhra_Bank":
			{
				roi(3.0);
				break;
			}
			case "HDFC_Bank":
			{
				roi(3.2);
				break;
			}
			case "YES_Bank":
			{
				roi(4.5);
				break;
			}
			default:
				roi(3.5);
				break;
			
		}
	}
	@Override
	public void roi(double roi) {
		// TODO Auto-generated method stub
		
		this.roi=roi;
	}
	public abstract void withdraw(int amount);
	public abstract void deposit(int amount);
	public abstract void checkAccountBalance();
	public abstract void Previous_5_Transactions();
}
