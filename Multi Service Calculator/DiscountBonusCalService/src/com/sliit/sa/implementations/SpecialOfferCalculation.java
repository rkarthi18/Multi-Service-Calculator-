package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.SpecialOfferService;

public class SpecialOfferCalculation implements SpecialOfferService{

	private double discountPercentage;
	private double bonusPercentage;
	private double amount;
	
	
	public SpecialOfferCalculation(double bonusPercentage,double discountPercentage, double amount) {
		super();
		this.discountPercentage = discountPercentage;
		this.bonusPercentage = bonusPercentage;
		this.amount = amount;
	}
	
	public SpecialOfferCalculation() {
		super();
	}






	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
//		double discount = amount * (100-getDiscountPercentage()/100);
//		double toalAmont = amount - discount;
		return this.amount * (discountPercentage/100);
		
	}

	@Override
	public double calculateBonus() {
		// TODO Auto-generated method stub
		return this.amount * (bonusPercentage/100);
	}

	@Override
	public double totalAmount(String calType) {
		// TODO Auto-generated method stub
		if(calType.toLowerCase().equals("discount"))
			return this.amount - calculateDiscount();
		else if(calType.toLowerCase().equals("bonus"))
			return this.amount + calculateDiscount();
		else
			return 0;
	}

	
	
	
}
