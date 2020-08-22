package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.ShapeService;

public class Triangle implements ShapeService {
	
	private double side1;
	private double side2;
	private double base;
	private double height;
	
	//Constructor
	public Triangle(double side1,double side2, double base, double height) {
		this.side1 = side1;
		this.side2 = side2;
		this.base = base;
		this.height = height;
	}

	//Constructor
	public Triangle() {
		// TODO Auto-generated constructor stub
		this.side1 = 0.0;
		this.side2 = 0.0;
		this.base = 0.0;
		this.height = 0.0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.base * this.height)/2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.side1 + this.side2 + this.base);
	}

}
