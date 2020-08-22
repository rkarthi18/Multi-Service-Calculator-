package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.BasicServiceInterfaces;

public class BasicService implements BasicServiceInterfaces {

	@Override
	public double add(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1+num2*1.0;
	}

	@Override
	public double substract(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1-num2*1.0;
	}

	@Override
	public double multiply(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1*num2*1.0;
	}

	@Override
	public double divide(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1/num2*1.0;
	}

}
