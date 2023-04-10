package com.first.one.HelloWorld;

public class Prices {
	
	private Double gold;
	private Double silver;
	private Double platinum;
	
	
	public Double getGold() {
		return gold;
	}
	public void setGold(Double gold) {
		this.gold = gold;
	}
	public Double getSilver() {
		return silver;
	}
	public void setSilver(Double silver) {
		this.silver = silver;
	}
	public Double getPlatinum() {
		return platinum;
	}
	public void setPlatinum(Double platinum) {
		this.platinum = platinum;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Price[GOLD = "+gold + "" + "SILVER: " + silver +"Platinum: " + platinum+"]";
	}
	

}
