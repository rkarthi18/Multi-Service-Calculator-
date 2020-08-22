package com.sliit.sa.interfaces;

public interface conversionService {

//lenght
	public double convertKmtoMiles(int kilometer);
	public double convertMiletoKm(int miles);
	public double convertYardtoM(int yards);
	public double convertMtoYard(int meter);
	public double convertInchestoFoot(int inch);
	public double convertFoottoInches(int foot);
	public double convertCmtoInches(int centimeter);
	public double convertInchestoCm(int inch);	
	public double convertMtoKm(int meter);
	public double convertKmtoM(int kilometer);
	public double convertCmtoM(int centimeter);
	public double convertMtoCm(int meter);
	public double convertMmtoCm(int millimeter);
	public double convertCmtoMm(int centimeter);
	public double convertMMtoMm(int micrometer);
	public double convertMmtoMM(int millimeter);
	public double convertNmtoMm(int nanometer);
	public double convertMmtoNm(int micrometer);
	
//temperature	
	public double convertKtoC(int k);
	public double convertCtoK(int c);
	public double convertCtoF(int c);
	public double convertFtoC(int f);
	
//weight
	public double convertMgtoG(int milligram);
	public double convertGtoMg(int gram);
	public double convertGtoKg(int gram);
	public double convertKgtoG(int kg);
	public double convertKgtoTon(int kg);
	public double convertTontoKg(int ton);
	public double convertGtoCarrat(int gram);
	public double convertCarrattoG(int carrat);
	public double convertGtoPound(int gram);
	public double convertPoundtoG(int pound);
	public double convertPoundtoOunce(int pound);
	public double convertOuncetoPound(int ounce);
}
