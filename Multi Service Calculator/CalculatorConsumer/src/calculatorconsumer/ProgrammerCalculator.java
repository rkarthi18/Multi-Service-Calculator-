package calculatorconsumer;

import javax.swing.JOptionPane;

import com.sliit.sa.interfaces.ProgrammerInterfaces;

public class ProgrammerCalculator {

	int  type=1;
	String  input,number;
	
	public void ProgrammerCalculatorOperations (ProgrammerInterfaces programmer) {
		while (type!=0) {
			
			input = JOptionPane.showInputDialog(null,"Press 1 - Decimal to Binary \n Press 2 - Decimal to Hexadecimal  \n Press 3 - Decimal to Octal \n\n"
					+ "								 Press 4 - Binary to Decimal \n Press 5 - Binary to Hexadecimal \n Press 6 - Binary to Octal \n\n"
					+ "								 Press 7 - Hexadecimal to Decimal \n Press 8 - Hexadecimal to Binary \n Press 9 - Hexadecimal to Octal \n\n"
					+ "								 Press 10 - Octal to Decimal \n Press 11 - Octal to Binary \n Press 12 - Octal to Hexadecimal \n\n Press 0 - Back \n \n"
					+ "								 NOTE : Errors will be displayed if incorrect data types are entered ");
		if(Validate.validateNumber(input)) {
			type=Integer.parseInt(input);
			
			if(type==1) {
				number = JOptionPane.showInputDialog("Enter the Decimal number  ");
				if(Validate.validateNumber(number)) {
					JOptionPane.showMessageDialog(null, "Binary Number relevant to Decimal " + number + " is " + programmer.DecimalToBinary(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			if(type==2) {
				number = JOptionPane.showInputDialog("Enter the Decimal number  ");
				if(Validate.validateNumber(number)) {
					JOptionPane.showMessageDialog(null, "Hexadecimal Number relevant to Decimal " + number + " is " + programmer.DecimalToHexaDecimal(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			
			if(type==3) {
				number = JOptionPane.showInputDialog("Enter the Decimal number  ");
				if(Validate.validateNumber(number)) {
					JOptionPane.showMessageDialog(null, "Octal Number relevant to Decimal " + number + " is " + programmer.DecimalToOctal(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			if(type==4) {
				number = JOptionPane.showInputDialog("Enter the Binary number  ");
				if(Validate.validateBinary(number)) {
					JOptionPane.showMessageDialog(null, "Decimal Number relevant to Binary " + number + " is " + programmer.BinaryToDecimal(number) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only binary numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			if(type==5) {
				number = JOptionPane.showInputDialog("Enter the Binary number  ");
				if(Validate.validateBinary(number)) {
					JOptionPane.showMessageDialog(null, "Hexadecimal Number relevant to Binary " + number + " is " + programmer.BinaryToHexaDecimal(number) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only binary numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			if(type==6) {
				number = JOptionPane.showInputDialog("Enter the Binary number  ");
				if(Validate.validateBinary(number)) {
					JOptionPane.showMessageDialog(null, "Octal Number relevant to Binary " + number + " is " + programmer.BinaryToOctal(number) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only binary numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			if(type==7) {
				number = JOptionPane.showInputDialog("Enter the Hexadecimal number  ");
				if(Validate.validateHexadecimal(number)) {
					JOptionPane.showMessageDialog(null, "Decimal Number relevant to Hexadecimal " + number + " is " + programmer.HexaDecimalToDecimal(number) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only numbers and text from a-e", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			if(type==8) {
				number = JOptionPane.showInputDialog("Enter the Hexadecimal number  ");
				if(Validate.validateHexadecimal(number)) {
					JOptionPane.showMessageDialog(null, "Binary Number relevant to Hexadecimal " + number + " is " + programmer.HexaDecimalToBinary(number) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only numbers and text from a-e", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			if(type==9) {
				number = JOptionPane.showInputDialog("Enter the Hexadecimal number  ");
				if(Validate.validateHexadecimal(number)) {
					JOptionPane.showMessageDialog(null, "Octal Number relevant to Hexadecimal " + number + " is " + programmer.HexaDecimalToOctal(number) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only numbers and text from a-e", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			if(type==10) {
				number = JOptionPane.showInputDialog("Enter the Octal number  ");
				if(Validate.validateOctal(number)) {
					JOptionPane.showMessageDialog(null, "Decimal Number relevant to Octal " + number + " is " + programmer.OctalToDecimal(number) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only octal numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			if(type==11) {
				number = JOptionPane.showInputDialog("Enter the Octal number  ");
				if(Validate.validateOctal(number)) {
					JOptionPane.showMessageDialog(null, "Binary Number relevant to Octal " + number + " is " + programmer.OctalToBinary(number) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only octal numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}
			if(type==12) {
				number = JOptionPane.showInputDialog("Enter the Octal number  ");
				if(Validate.validateOctal(number)) {
					JOptionPane.showMessageDialog(null, "Hexadecimal Number relevant to Octal " + number + " is " + programmer.OctalToHexaDecimal(number) , "Answer", JOptionPane.INFORMATION_MESSAGE);
					continue;
				}
				else {
					JOptionPane.showMessageDialog(null, "Please enter only octal numbers", "Input Error", JOptionPane.ERROR_MESSAGE);
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
