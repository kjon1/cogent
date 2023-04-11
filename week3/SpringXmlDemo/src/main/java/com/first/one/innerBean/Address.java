package com.first.one.innerBean;

public class Address {
	private int streetNo;
	private String city;
	private String state;
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Address[ street number: " + streetNo + " City: " + city + " State" + state + "]";
	}
	

}
