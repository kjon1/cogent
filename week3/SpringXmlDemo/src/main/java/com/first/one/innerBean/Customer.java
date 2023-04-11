package com.first.one.innerBean;

public class Customer {
	private int custNo;
	private Address address;//customer is the dependant object//
	
	
	
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer Info= [ Customer number: " + custNo + " Address: " + address + "]";
	}
	

}
