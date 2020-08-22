package calculatorconsumer;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import com.sliit.sa.interfaces.BasicServiceInterfaces;

public class BasicCalculator {
	int  type=1;
	String  input,num1,num2;
	DecimalFormat df = new DecimalFormat("#.##");
	public  void BasicCalculatorOperations(BasicServiceInterfaces basicService) {
		
		while(type!=0) {
			
			input = JOptionPane.showInputDialog(null,"Press 1 - Add \n Press 2 - Substract \n Press 3 - Multiply \n Press 4 - Divide \n Press 0 - Exit \n \n NOTE : Errors will be displayed if incorrect data types are entered ");
			
			if(Validate.validateNumber(input)) {
				type = Integer.parseInt(input);
				if(type==1) {
					num1 = JOptionPane.showInputDialog("Enter the first number  ");
					if(Validate.validateNumber(num1)) {
						num2 = JOptionPane.showInputDialog("Enter the Second number ");
						if(Validate.validateNumber(num2)) {
							JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + df.format(basicService.add(Double.parseDouble(num1), Double.parseDouble(num2))) , "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
							continue;
						}
					}
				
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==2) {
					num1 = JOptionPane.showInputDialog("Enter the first number  ");
					if(Validate.validateNumber(num1)) {
						num2 = JOptionPane.showInputDialog("Enter the Second number ");
						if(Validate.validateNumber(num2)) {
							JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + df.format(basicService.substract(Double.parseDouble(num1), Double.parseDouble(num2))) , "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
							continue;
						}
					}
				
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==3) {
					num1 = JOptionPane.showInputDialog("Enter the first number  ");
					if(Validate.validateNumber(num1)) {
						num2 = JOptionPane.showInputDialog("Enter the Second number ");
						if(Validate.validateNumber(num2)) {
							JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + df.format(basicService.multiply(Double.parseDouble(num1), Double.parseDouble(num2))) , "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
							continue;
						}
					}
				
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==4) {
					num1 = JOptionPane.showInputDialog("Enter the first number  ");
					if(Validate.validateNumber(num1)) {
						num2 = JOptionPane.showInputDialog("Enter the Second number ");
						if(Validate.validateNumber(num2)) {
							JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + df.format(basicService.divide(Double.parseDouble(num1), Double.parseDouble(num2))) , "Answer", JOptionPane.INFORMATION_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
							continue;
						}
					}
				
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
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
