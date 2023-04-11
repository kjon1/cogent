package com.first.one.check;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;

public class Medicine {
	
	private int number;
	private String name;
	
	private List<String>activeIngredients;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Medicines [ number= " + number + " Name: " + name + " Active Ingredients: " + activeIngredients +"]";
	}

	public int getNumber() {
		return number;
	}
	

	@Required
	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getActiveIngredients() {
		return activeIngredients;
	}

	public void setActiveIngredients(List<String> activeIngredients) {
		this.activeIngredients = activeIngredients;
	}

	
	

}
