package calculatorconsumer;

import javax.swing.JOptionPane;

import com.sliit.sa.interfaces.FactoryService;
import com.sliit.sa.interfaces.ShapeService;
import com.sliit.sa.interfaces.SolidShapeService;

public class ShapeCalculator {

	int  type=1,type1=1;
	String  input,number,input1;
	public void shapeCalculatorOperations(FactoryService service) {
		while(type!=0) {
			input = JOptionPane.showInputDialog("Press 1 - Flat \n Press 2 - Solid \n\n Press 0 - Exit");
			if(Validate.validateNumber(input)) {
				type=Integer.parseInt(input);
				if(type==1) {
					type1=1;
					while(type1!=0) {
					input1 = JOptionPane.showInputDialog("Press 1 - Circle \n Press 2 - Rectangle \n Press 3 - Triangle \n Press 4 - Square \n\n Press 0 - Exit");
					if(Validate.validateNumber(input1)) {
						type1=Integer.parseInt(input1);
						if(type1==1) {
							ShapeService circle = service.getShape("circle");
							JOptionPane.showMessageDialog(null, "Area of the circle :" +circle.getArea() + " \n Perimeter of the circle : " + circle.getPerimeter(), "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						if(type1==2) {
							ShapeService rectangle = service.getShape("rectangle");
							JOptionPane.showMessageDialog(null, "Area of the rectangle :" +rectangle.getArea() + " \n Perimeter of the rectangle : " + rectangle.getPerimeter(), "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						if(type1==3) {
							ShapeService triangle = service.getShape("triangle");
							JOptionPane.showMessageDialog(null, "Area of the triangle :" +triangle.getArea() + " \n Perimeter of the triangle : " + triangle.getPerimeter(), "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						if(type1==4) {
							ShapeService square = service.getShape("square");
							JOptionPane.showMessageDialog(null, "Area of the square :" +square.getArea() + " \n Perimeter of the square : " + square.getPerimeter(), "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter the correct operations", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
						continue;
					}
					}
				}
				if(type==2) {
					//solid
					type1=1;
					while(type1!=0) {
					input1 = JOptionPane.showInputDialog("Press 1 - Sphere \n Press 2 - Cube \n \n Press 0 - Exit");
					if(Validate.validateNumber(input1)) {
						type1=Integer.parseInt(input1);
						if(type1==1) {
							SolidShapeService sphere = service.getSolidShape("sphere");
							
							JOptionPane.showMessageDialog(null, "Area of the sphere :" +sphere.getArea() + " \n volume of the sphere : " + sphere.getVolume(), "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						if(type1==2) {
							SolidShapeService cube = service.getSolidShape("cube");
							JOptionPane.showMessageDialog(null, "Area of the cube :" +cube.getArea() + " \n volume of the cube : " + cube.getVolume(), "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						
						}
					}
				}
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Please enter the correct operations", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
				continue;
			}
		}
	}
}
