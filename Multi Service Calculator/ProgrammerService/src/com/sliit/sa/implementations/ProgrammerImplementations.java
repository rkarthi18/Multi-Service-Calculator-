package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.ProgrammerInterfaces;

public class ProgrammerImplementations implements ProgrammerInterfaces {

	@Override
	public String DecimalToBinary(int decimal) {
		return Integer.toBinaryString(decimal);
	}

	@Override
	public String DecimalToHexaDecimal(int decimal) {
		return Integer.toHexString(decimal);
	}

	@Override
	public String DecimalToOctal(int decimal) {
		return Integer.toOctalString(decimal);
	}

	@Override
	public long BinaryToDecimal(String binary) {
		return Integer.parseInt(binary,2);
	}

	@Override
	public String BinaryToHexaDecimal(String binary) {
		int decimal =Integer.parseInt(binary,2);
		return Integer.toHexString(decimal);
	}

	@Override
	public String BinaryToOctal(String binary) {
		int decimal =Integer.parseInt(binary,2);
		return Integer.toOctalString(decimal);
	}

	@Override
	public long HexaDecimalToDecimal(String hexadecimal) {
		return Integer.parseInt(hexadecimal,16);
	}

	@Override
	public String HexaDecimalToBinary(String hexadecimal) {
		int decimal = Integer.parseInt(hexadecimal,16);
		return Integer.toBinaryString(decimal);
	}

	@Override
	public String HexaDecimalToOctal(String hexadecimal) {
		int decimal = Integer.parseInt(hexadecimal,16);
		return Integer.toOctalString(decimal);
	}

	@Override
	public long OctalToDecimal(String octal) {
		return Integer.parseInt(octal,8);
	}

	@Override
	public String OctalToBinary(String octal) {
		int decimal = Integer.parseInt(octal,8);
		return Integer.toBinaryString(decimal);
	}

	@Override
	public String OctalToHexaDecimal(String octal) {
		int decimal = Integer.parseInt(octal,8);
		return Integer.toHexString(decimal);
	}

}
