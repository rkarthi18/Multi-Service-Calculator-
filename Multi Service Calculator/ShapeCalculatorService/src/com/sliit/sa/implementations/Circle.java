package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.ShapeService;

public class Circle implements ShapeService {

	private double radius;
		
	//Constructor
	public Circle() {
		this.radius=0.0;
	}
	
	//Constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14 * this.radius * this.radius;
	}

	
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * this.radius;
	}

}
