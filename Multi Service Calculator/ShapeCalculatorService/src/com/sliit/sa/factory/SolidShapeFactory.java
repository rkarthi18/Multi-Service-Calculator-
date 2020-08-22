package com.sliit.sa.factory;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sliit.sa.interfaces.FactoryService;
import com.sliit.sa.interfaces.ShapeService;
import com.sliit.sa.interfaces.SolidShapeService;

import com.sliit.sa.implementations.Cube;
import com.sliit.sa.implementations.Sphere;

public class SolidShapeFactory implements FactoryService {
	
	//Creating solid shape objects
	public SolidShapeService getSolidShape(String solidShapeType) {
		
		double radius=0,length=0;
		String radius_string,length_string;
		int valid;
		
		if(solidShapeType.toLowerCase().equals("sphere")) {
			
			//creation of sphere object
//			System.out.println("Enter the radius :");
			valid=1;
			while(valid!=0) {
			radius_string=JOptionPane.showInputDialog("Enter the radius :");
			if(validate(radius_string)) {
			radius = Double.parseDouble(radius_string);
				valid=0;
			}
			else {
				valid=1;
			}
			}
			
			
			return  new Sphere(radius);
		}
		else if(solidShapeType.toLowerCase().equals("cube")) {
			
			//creation of cube object
//			System.out.println("Enter the length :");
			valid=1;
			while(valid!=0) {
			length_string = JOptionPane.showInputDialog("Enter the length :");
			if(validate(length_string)) {
			length = Double.parseDouble(length_string);
			valid=0;
			}
			else {
				valid=1;
			}
			}
			return  new Cube(length);
		}
		else {
			
			return null;
		}
	}

	@Override
	public ShapeService getShape(String shapeType) {
		ShapeFactory shapeFactory = new ShapeFactory();
		return shapeFactory.getShape(shapeType);
	}
	
	public boolean validate(String input) {
		if (input.matches("^(\\d*\\.)?\\d+$"))
			return true;
		return false;
	}

}
