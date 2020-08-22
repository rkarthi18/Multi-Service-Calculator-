package calculatorconsumer;

import javax.swing.JOptionPane;

import com.sliit.sa.interfaces.NumberSeriesInterfaces;

public class NumberSeriesCalculator {

	int  type=1;
	String  input,number;
	
	public void NumberSeriesCalculatorOperations(NumberSeriesInterfaces service_series) {
		while (type!=0) {
			input = JOptionPane.showInputDialog(null, "Press 1 - fibonacci number \n Press 2 - Square number \n Press 3 - Factorial number \n Press 4 - Prime number  \n\n Press 0 - Back", "Operations", JOptionPane.INFORMATION_MESSAGE);
			if(Validate.validateNumber(input)) {
				type=Integer.parseInt(input);
				if(type==1) {
					number = JOptionPane.showInputDialog("Enter the position of fibinocci number needed : ");
					if(Validate.validateNumber(number)) {
						JOptionPane.showMessageDialog(null, "The Answer is : " + service_series.fibonacci(Integer.parseInt(number)), "Answer", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
					
				}
				if(type==2) {
					number = JOptionPane.showInputDialog("Enter the position of square number needed : ");
					if(Validate.validateNumber(number)) {
						JOptionPane.showMessageDialog(null, "The Answer is : " + service_series.findSquareNumber(Integer.parseInt(number)), "Answer", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==3) {
					number = JOptionPane.showInputDialog("Enter factorial  number needed : ");
					if(Validate.validateNumber(number)) {
						JOptionPane.showMessageDialog(null, "The Answer is : " + service_series.findFactorial(Integer.parseInt(number)), "Answer", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
						continue;
					}
				}
				if(type==4) {
					number = JOptionPane.showInputDialog("Enter the number to checked whether the number is prime or not ");
					if(Validate.validateNumber(number)) {
						String answer;
						if(service_series.findPrime(Integer.parseInt(number))) {
							answer = number + " is prime "; 
						}
						else {
							answer = number + " is not prime";
						}
						JOptionPane.showMessageDialog(null, answer, "Answer", JOptionPane.INFORMATION_MESSAGE);
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
