package com.in28Minutes.SI;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {

	
	BigDecimal principal,intrest;
	
	public SimpleIntrestCalculator(String principal, String intrest) {
		this.principal=new BigDecimal(principal);
		this.intrest =new BigDecimal(intrest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		//Total value =principal+(principal*intrest*noOfYears)
		BigDecimal noOfYearsBigDecimal=new BigDecimal(noOfYears);
		BigDecimal totalValue=principal.add(principal.multiply(intrest).multiply(noOfYearsBigDecimal));
		return totalValue;
	}

	

}
