package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.SolidShapeService;

public class Cube implements SolidShapeService {

	private double length;
	
	//Constructor
	public Cube(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 6 * (this.length * this.length);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return this.length * this.length * this.length;
	}



}
