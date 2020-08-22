package calculatorconsumer;

import javax.swing.JOptionPane;

import com.sliit.sa.interfaces.ShapeService;
import com.sliit.sa.interfaces.conversionService;

public class ConversionCalculator {

	int  type=1,type1=1;
	String  input,number,input1;
	
	public void ConversionCalculatorOperation(conversionService conversion_service) {
		while(type!=0) {
			input = JOptionPane.showInputDialog("Press 1 - Length \n Press 2 - Temperatue \n Press 3 - Weight \n\n Press 0 - Exit");
			if(Validate.validateNumber(input)) {
				type=Integer.parseInt(input);
				if(type==1) {
					type1=1;
					while(type1!=0) {
						input1 = JOptionPane.showInputDialog(""
								+ "Press 1 - Convert Kilometer to Miles \n "
								+ "Press 2 - Convert Miles to Kilometer \n "
								+ "Press 3 - Convert Yard to Meter \n "
								+ "Press 4 - Convert Meter to Yard \n "
								+ "Press 5 - Convert Inchest to Foot \n"
								+ "Press 6 - Convert Foot to Inchest \n"
								+ "Press 7 - Convert Centimeter to Inches \n"
								+ "Press 8 - Convert Inches to Centimeter \n"
								+ "Press 9 - Convert Meter to Kilometer \n"
								+ "Press 10 - Convert Kilometer to Meter \n"
								+ "Press 11 - Convert Centimeter to Meter \n"
								+ "Press 12 - Convert Meter to Centimeter \n"
								+ "Press 13 - Convert Millimeter to Centimeter \n"
								+ "Press 14 - Convert Centimeter to Millimeter \n"
								+ "Press 15 - Convert Micrometer to Millimeter \n"
								+ "Press 16 - Convert Millimeter to Micrometer \n"
								+ "Press 17 - Convert Nanometer to Micrometer \n"
								+ "Press 18 - Convert Micrometer to Nanometer \n"
								+ "\n Press 0 - Exit");
					
						if(Validate.validateNumber(input1)) {
							type1=Integer.parseInt(input1);
							if(type1==1) {
								number = JOptionPane.showInputDialog("Enter the Kilometer");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " + conversion_service.convertKmtoMiles(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==2) {

								number = JOptionPane.showInputDialog("Enter the Miles");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " + conversion_service.convertMiletoKm(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==3) {

								number = JOptionPane.showInputDialog("Enter the Yards");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " + conversion_service.convertYardtoM(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==4) {

								number = JOptionPane.showInputDialog("Enter the Meter");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " + conversion_service.convertMtoYard(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==5) {

								number = JOptionPane.showInputDialog("Enter the Inches");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertInchestoFoot(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==6) {

								number = JOptionPane.showInputDialog("Enter the Foot");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertFoottoInches(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==7) {

								number = JOptionPane.showInputDialog("Enter the Centimeter");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertCmtoInches(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==8) {

								number = JOptionPane.showInputDialog("Enter the Inch");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertInchestoCm(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==9) {

								number = JOptionPane.showInputDialog("Enter the Meter");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertMtoKm(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==10) {

								number = JOptionPane.showInputDialog("Enter the Kilometer");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertKmtoM(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==11) {

								number = JOptionPane.showInputDialog("Enter the Centimeter");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertCmtoM(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==12) {

								number = JOptionPane.showInputDialog("Enter the Meter");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertMtoCm(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==13) {

								number = JOptionPane.showInputDialog("Enter the Millimeter");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertMmtoCm(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==14) {

								number = JOptionPane.showInputDialog("Enter the Centimeter");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertCmtoMm(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==15) {

								number = JOptionPane.showInputDialog("Enter the Micrometer");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertMMtoMm(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==16) {

								number = JOptionPane.showInputDialog("Enter the Millimeter");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertMmtoMM(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==17) {

								number = JOptionPane.showInputDialog("Enter the Nanometer");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertNmtoMm(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==18) {

								number = JOptionPane.showInputDialog("Enter the Micrometer");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertMmtoNm(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
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
				if(type==2) {

					type1=1;
					while(type1!=0) {
						input1 = JOptionPane.showInputDialog(""
								+ "Press 1 - Convert Kelvin to Celcius \n "
								+ "Press 2 - Convert Celcius to Kelvin \n "
								+ "Press 3 - Convert Celcius to Fahrenheit \n "
								+ "Press 4 - Convert Fahrenheit to Celcius \n "
								+ "\n Press 0 - Exit");
					
						if(Validate.validateNumber(input1)) {
							type1=Integer.parseInt(input1);
							if(type1==1) {
								number = JOptionPane.showInputDialog("Enter the Kelvin");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertKtoC(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==2) {

								number = JOptionPane.showInputDialog("Enter the Celcius");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertCtoK(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==3) {

								number = JOptionPane.showInputDialog("Enter the Celcius");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertCtoF(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==4) {

								number = JOptionPane.showInputDialog("Enter the Fahrenheit");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertFtoC(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
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
				if(type==3) {

					type1=1;
					while(type1!=0) {
						input1 = JOptionPane.showInputDialog(""
								+ "Press 1 - Convert Milligram to Gram  \n "
								+ "Press 2 - Convert Gram to Milligram \n "
								+ "Press 3 - Convert Gram to Kilogram \n "
								+ "Press 4 - Convert Kilogram to Gram \n"
								+ "Press 5 - Convert Kilogram to Ton \n"
								+ "Press 6 - Convert Ton to Kilogram \n"
								+ "Press 7 - Convert Gram to Carrat \n"
								+ "Press 8 - Convert Carrat to Gram \n"
								+ "Press 9 - Convert Gram to Pound \n"
								+ "Press 10 - Convert Pound to Gram  \n"
								+ "Press 11 - Convert Pound to Ounce \n"
								+ "Press 12 - Convert Ounce to Pound  \n"
								+ "\n Press 0 - Exit");
					
						if(Validate.validateNumber(input1)) {
							type1=Integer.parseInt(input1);
							if(type1==1) {
								number = JOptionPane.showInputDialog("Enter the  Milligram");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertMgtoG(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==2) {

								number = JOptionPane.showInputDialog("Enter the Gram");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertGtoMg(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==3) {

								number = JOptionPane.showInputDialog("Enter the  Gram");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertGtoKg(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==4) {

								number = JOptionPane.showInputDialog("Enter the Kilogram");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertKgtoG(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==5) {

								number = JOptionPane.showInputDialog("Enter the Kilogram");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertKgtoTon(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==6) {

								number = JOptionPane.showInputDialog("Enter Ton");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertTontoKg(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==7) {

								number = JOptionPane.showInputDialog("Enter the Gram");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertGtoCarrat(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==8) {

								number = JOptionPane.showInputDialog("Enter the Carrat");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertCarrattoG(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==9) {

								number = JOptionPane.showInputDialog("Enter the Gram");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertGtoPound(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==10) {

								number = JOptionPane.showInputDialog("Enter the Pound");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertPoundtoG(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==11) {

								number = JOptionPane.showInputDialog("Enter the Pound");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertPoundtoOunce(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
									continue;
								}
							}
							if(type1==12) {

								number = JOptionPane.showInputDialog("Enter the Ounce");
								if(Validate.validateNumber(number)) {
									JOptionPane.showMessageDialog(null, "Answer is " +conversion_service.convertOuncetoPound(Integer.parseInt(number)) , "Answer", JOptionPane.INFORMATION_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Please enter only numbers", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
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
			else {
				JOptionPane.showMessageDialog(null, "Please enter the correct operations", "Incorrect Input", JOptionPane.ERROR_MESSAGE);
				continue;
			}
		}
	}
	
}
