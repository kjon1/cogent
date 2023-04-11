package com.first.one.HelloWorld;

public class Ring {
	
	private Prices prices; //reference type//

	public Prices getPrices() {
		return prices;
	}

	public void setPrices(Prices prices) {
		this.prices = prices;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ring[prices= " + prices +"]";
	}
	
	
	

}
