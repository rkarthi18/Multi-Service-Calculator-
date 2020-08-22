package com.sliit.sa.interfaces;

public interface ProgrammerInterfaces {
	
	public String DecimalToBinary(int decimal); 
	public String DecimalToHexaDecimal(int decimal);
	public String DecimalToOctal(int decimal);
	
	public long BinaryToDecimal(String binary);
	public String BinaryToHexaDecimal(String binary);
	public String BinaryToOctal (String binary);
	
	public long HexaDecimalToDecimal(String hexadecimal);
	public String HexaDecimalToBinary(String hexadecimal);
	public String HexaDecimalToOctal(String hexadecimal);
	       
	public long OctalToDecimal(String octal);
	public String OctalToBinary(String octal);
	public String OctalToHexaDecimal(String octal);
}
