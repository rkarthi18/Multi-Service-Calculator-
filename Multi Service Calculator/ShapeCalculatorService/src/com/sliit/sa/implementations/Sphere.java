package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.SolidShapeService;

public class Sphere implements SolidShapeService {

	private double radius;
	
	//Constructor
	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 4 * 3.14 * (this.radius*this.radius);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return ((4/3) * 3.14 * (this.radius*this.radius*this.radius));
	}

	

}
