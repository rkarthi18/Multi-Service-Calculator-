package mathconsumer;

import java.util.Scanner;

import javax.swing.JOptionPane;

import conversionservice.conversionService;
import mathservice.MathService;

public class test {

	private static conversionService con_serve;
	private static MathService math_serve;
	
	public void getServiceAndPrintHi(conversionService con_serve) {
		this.con_serve = con_serve;
		int conservice_type =1;
		while (conservice_type!=0) {
			conservice_type = Integer.parseInt(JOptionPane.showInputDialog("Press 1 - Convert Km to M \n Press 2 - Convert M to Km \n Press 0 -  Back"));
			if (conservice_type==1) {
			System.out.println("Enter the Numbers to be converted :");
			
			int km = Integer.parseInt(JOptionPane.showInputDialog("Enter the Km  "));
			
			JOptionPane.showMessageDialog(null, "The answer is : " + this.con_serve.convertKmtoM(km), "Answer", JOptionPane.DEFAULT_OPTION);
			continue;
			}
			else if (conservice_type ==2) {
				System.out.println("Enter the Numbers to be converted :");
				
				int m = Integer.parseInt(JOptionPane.showInputDialog("Enter the Meters "));
				
				JOptionPane.showMessageDialog(null, "The answer is : " + this.con_serve.convertMtoKm(m), "Answer", JOptionPane.DEFAULT_OPTION);
				continue;
			}
		}
		
		
		
	}
	
	public void getMathserviceAndRun(MathService math_serve) {
		this.math_serve = math_serve;
		int mathservice_type =1;
		
		
		while (mathservice_type!=0) {
			mathservice_type = Integer.parseInt(JOptionPane.showInputDialog("Press 1 - Add \n Press 2 - Substract \n Press 0 -  Back"));
			if (mathservice_type==1) {
			System.out.println("Enter the Numbers to be added :");
			
			int x = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number "));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Enter the Second number"));
			JOptionPane.showMessageDialog(null, "The answer is : " + this.math_serve.sum(x, y), "Answer", JOptionPane.DEFAULT_OPTION);
			continue;
			}
			else if (mathservice_type ==2) {
				System.out.println("Enter the Numbers to be added :");
				
				int x = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number "));
				int y = Integer.parseInt(JOptionPane.showInputDialog("Enter the Second number"));
				JOptionPane.showMessageDialog(null, "The answer is : " + this.math_serve.substract(x, y), "Answer", JOptionPane.DEFAULT_OPTION);
				continue;
			}
		}
		
		
		
	}

}
