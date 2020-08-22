package calculatorconsumer;

import javax.swing.JOptionPane;

import com.sliit.sa.implementations.SpecialOfferCalculation;
import com.sliit.sa.interfaces.SpecialOfferService;

public class DiscountCalculator {

	int  type=1;
	String  input,amount_string,bonus_string,discount_string;
	
	public void DiscountCalculatorOperation (SpecialOfferService special_service) {
		while(type!=0) {
			input = JOptionPane.showInputDialog("Press 1 - Calculate discount \n Press 2 - Calculate Bonus \n\n Press 0 - Back \n NOTE : Errors will be displayed if incorrect data types are entered");
			if(Validate.validateNumber(input)) {
				type=Integer.parseInt(input);
				if(type==1) {
					discount_string = JOptionPane.showInputDialog("Enter the discount :"  );
					if(Validate.validateNumber(discount_string)) {
						
						amount_string = JOptionPane.showInputDialog("Enter the Amount :"  );
						if(Validate.validateNumber(amount_string)) {
							SpecialOfferCalculation calc = new SpecialOfferCalculation(0.0,Double.parseDouble(discount_string),Double.parseDouble(amount_string));
							JOptionPane.showMessageDialog(null, "Discount amount : " + calc.calculateDiscount() + " \n Amount to be paid : " + calc.totalAmount("discount"), "Answer", JOptionPane.INFORMATION_MESSAGE);
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
				if (type==2) {
					
					bonus_string = JOptionPane.showInputDialog("Enter the bonus :"  );
					if(Validate.validateNumber(bonus_string)) {
						
						amount_string = JOptionPane.showInputDialog("Enter the Amount :"  );
						if(Validate.validateNumber(amount_string)) {
							SpecialOfferCalculation calc = new SpecialOfferCalculation(Double.parseDouble(bonus_string),0.0,Double.parseDouble(amount_string));
							JOptionPane.showMessageDialog(null, "Discount amount : " + calc.calculateBonus() + " \n Amount to be paid : " + calc.totalAmount("bonus"), "Answer", JOptionPane.INFORMATION_MESSAGE);
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
