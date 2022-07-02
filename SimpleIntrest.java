package com.in28Minutes.SI;

import java.math.BigDecimal;

public class SimpleIntrest {

	public static void main(String[] args) {
		SimpleIntrestCalculator calculator=new SimpleIntrestCalculator("4500.00","7.5");
		 BigDecimal totalValue=calculator.calculateTotalValue(5);//5years
	
		System.out.println(totalValue);

	}

}
