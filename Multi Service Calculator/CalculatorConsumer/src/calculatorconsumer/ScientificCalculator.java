package calculatorconsumer;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import com.sliit.sa.interfaces.ScientificInterfaces;

public class ScientificCalculator {

	int  type=1;
	String  input,number;
	DecimalFormat df = new DecimalFormat("#.##");
	public void ScientificCalculatorOperations (ScientificInterfaces scientific) {
		
		while(type!=0) {
			input = JOptionPane.showInputDialog("Enter the expression (Press 0 to go back) :  \n Math Operators Acceptors : +,-,*,/,(,) \n Errors will be displayed for incorrect input types and for eneven brackets ");
			if (Validate.validateScientific(input) && Validate.validateBrackets(input)) {
				
				if(input.equals("0")) {
					break;
				}
				JOptionPane.showMessageDialog(null, input + " = " + df.format(scientific.ScientificCalculation(input)), "Answer", JOptionPane.INFORMATION_MESSAGE);
				continue;
			}
			else {
				JOptionPane.showMessageDialog(null, "Please enter according to the guideline showed", "Input Error", JOptionPane.ERROR_MESSAGE);
				continue;
			}
		}
	}
}
