package com.sliit.sa.factory;


import java.util.Scanner;

import javax.swing.JOptionPane;

import com.sliit.sa.interfaces.FactoryService;
import com.sliit.sa.interfaces.ShapeService;
import com.sliit.sa.interfaces.SolidShapeService;
import com.sliit.sa.implementations.Circle;
import com.sliit.sa.implementations.Rectangle;
import com.sliit.sa.implementations.Square;
import com.sliit.sa.implementations.Triangle;

public class ShapeFactory implements FactoryService {

	//Creating flat shape objects to the given shape type 
	public ShapeService getShape(String shapeType) {
	
		Scanner scan = new Scanner(System.in);
		int valid=1;
		double radius = 0,length = 0,width = 0,height=0,side1 = 0,side2=0,base=0;
		String radius_string,length_string,width_string,side1_string,side2_string,height_string,base_string;
		
		if(shapeType.toLowerCase().equals("circle")) {

			//creation of circle object
//			System.out.println("Enter the radius :");
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
			return (ShapeService) new Circle(radius);
		
		}else if(shapeType.toLowerCase().equals("rectangle")) {
			valid=1;
			//creation of rectangle object
//			System.out.println("Enter the length :");
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
//			System.out.println("Enter the width :");
			valid=1;
			while(valid!=0) {
			width_string = JOptionPane.showInputDialog("Enter the Width :");
			if(validate(width_string)) {
			width = Double.parseDouble(width_string);
			valid=0;
			}
			else {
				valid=1;
			}
			}
			return (ShapeService) new Rectangle(length, width);
		
		}
		else if(shapeType.toLowerCase().equals("square")) {
		
			//creation of square object
//			System.out.println("Enter the length :");
			valid =1;
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
			
			return (ShapeService) new Square(length);
		
		}
		else if(shapeType.toLowerCase().equals("triangle")) {
		
			//creation of triangle object
//			System.out.println("Enter the side1 :");
			valid =1;
			while(valid!=0) {
			side1_string =  JOptionPane.showInputDialog("Enter the side1 :");
			if(validate(side1_string)) {
				side1 = Double.parseDouble(side1_string);
				valid=1;
			}
			else {
				valid=0;
			}
			
			}
			
//			System.out.println("Enter the side2 :");
			valid =1;
			while(valid!=0) {
			side2_string =  JOptionPane.showInputDialog("Enter the side2 :");
			if(validate(side2_string)) {
				side2 = Double.parseDouble(side2_string);
				valid=1;
			}
			else {
				valid=0;
			}
			
			}
			
//			System.out.println("Enter the base :");
			valid =1;
			while(valid!=0) {
			base_string = JOptionPane.showInputDialog("Enter the base :");
			if(validate(base_string)) {
				base = Double.parseDouble(base_string);
				valid=1;
			}
			else {
				valid=0;
			}
			
			
			}
			
//			System.out.println("Enter the height :");
			valid =1;
			while(valid!=0) {
			height_string = JOptionPane.showInputDialog("Enter the height :");
			if(validate(height_string)) {
				height = Double.parseDouble(height_string);
				valid=1;
			}
			else {
				valid=0;
			}
			
			}
			
			return new Triangle(side1, side2, base, height);
		
		}
		else
			return null;
		
	}

	@Override
	public SolidShapeService getSolidShape(String solidShapeType) {
		// TODO Auto-generated method stub
		SolidShapeFactory solidShapeFactory = new SolidShapeFactory();
		return solidShapeFactory.getSolidShape(solidShapeType);
		
	}
	
	public boolean validate(String input) {
		if (input.matches("^(\\d*\\.)?\\d+$"))
			return true;
		return false;
	}
	
}
