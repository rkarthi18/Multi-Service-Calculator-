package calculatorconsumer;

import java.util.ArrayList;
import java.util.List;



public class Validate {
	public static  boolean validateNumber(String input) {
		if (input.matches("^(\\d*\\.)?\\d+$"))
			return true;
		return false;
	}

	public static  boolean validateScientific(String input) {
		if(input.matches("[0-9()+\\-*/.]+"))
			return true;
		return false;
	}
	public static boolean validateHexadecimal(String input) {
		if (input.matches("^[A-Fa-f0-9]+$"))
			return true;
		return false;
	}
	public static boolean validateBinary(String input) {
		if (input.matches("[01]+"))
			return true;
		return false;
	}
	public static boolean validateOctal(String input) {
		if (input.matches("[0-7]+"))
			return true;
		return false;
	}
	public static boolean validateBrackets(String input) {
		int count = 0 ;
		List<String> list = new ArrayList<String>();
		List<Character> list1 = new ArrayList<Character>();
		
		for(char c : input.toCharArray()) {
			if(c=='(') {
				list1.add(c);
				list.add("(");
				count++;
			}
			if(c==')') {
				list1.add(c);
				if(list.size()!=0) {
				count--;
				list.remove(list.size()-1);
				}
			}
		
		}
		
		if(count==0 && (list1.size()%2==0)) {
			return true;
		}
		return false;
		
	}
	
	
}
