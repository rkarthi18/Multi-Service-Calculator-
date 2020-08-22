package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.ShapeService;

public class Square implements ShapeService {

	private double length;
	
	//Constructor
	public Square(double length) {
		this.length = length;
	}

	//Constructor
	public Square() {
		// TODO Auto-generated constructor stub
		this.length = 0.0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.length * this.length;
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * this.length;
	}

}
