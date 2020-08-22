package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.conversionService;

public class conversionServiceImpl implements conversionService {

//length
	public double convertKmtoMiles(int kilometer) {
		return kilometer/1.60935;
	}
	
	public double convertMiletoKm(int miles) {
		return miles*1.60935;
	}
	
	public double convertYardtoM(int yards) {
		return yards*0.9144;
	}
	
	public double convertMtoYard(int meter) {
		return meter/0.9144;
	}
	
	public double convertInchestoFoot(int inch) {
		return inch/12.00;
	}
	public double convertFoottoInches(int foot) {
		return foot*12.00;
	}
	
	public double convertCmtoInches(int centimeter) {
		return centimeter/2.54;
	}
	
	public double convertInchestoCm(int inch) {
		return inch*2.54;
	}
		
	public double convertMtoKm(int meter) {
		// TODO Auto-generated method stub
		return meter/1000.0;
	}

	public double convertKmtoM(int kilometer) {
		// TODO Auto-generated method stub
		return kilometer*1000.0;
	}
	
	public double convertCmtoM(int centimeter){
		return centimeter/100.0;
	}
	
	public double convertMtoCm(int meter){
		return meter*100.0;
	}
	
	public double convertMmtoCm(int millimeter){
		return millimeter/10.0;
	}
	
	public double convertCmtoMm(int centimeter){
		return centimeter*10.0;
	}
	
	public double convertMMtoMm(int micrometer) {
		return micrometer/1000.0;
	}
	
	public double convertMmtoMM(int millimeter) {
		return millimeter*1000.0;
	}
	
	public double convertNmtoMm(int nanometer) {
		return nanometer/1000.0;
	}
	public double convertMmtoNm(int micrometer) {
		return micrometer*1000.0;
	}
	
	
//temperature
	public double convertKtoC(int k) {
		return k-273.15;
	}
	
	public double convertCtoK(int c) {
		return c+273.15;
	}
	
	public double convertCtoF(int c) {
		return c*1.8+32.0;
	}
	
	public double convertFtoC(int f) {
		return (f-32.0)/1.8;
	}

//weight
	@Override
	public double convertMgtoG(int milligram) {
		return milligram/1000.0;
	}

	@Override
	public double convertGtoMg(int gram) {
		// TODO Auto-generated method stub
		return gram*1000.0;
	}

	@Override
	public double convertGtoKg(int gram) {
		// TODO Auto-generated method stub
		return gram/1000.0;
	}

	@Override
	public double convertKgtoG(int kg) {
		// TODO Auto-generated method stub
		return kg*1000.0;
	}

	@Override
	public double convertKgtoTon(int kg) {
		// TODO Auto-generated method stub
		return kg/1000.0;
	}

	@Override
	public double convertTontoKg(int ton) {
		// TODO Auto-generated method stub
		return ton*1000.0;
	}

	@Override
	public double convertGtoCarrat(int gram) {
		// TODO Auto-generated method stub
		return gram*5;
	}

	@Override
	public double convertCarrattoG(int carrat) {
		// TODO Auto-generated method stub
		return carrat/5;
	}

	@Override
	public double convertGtoPound(int gram) {
		// TODO Auto-generated method stub
		return gram/453.592;
	}

	@Override
	public double convertPoundtoG(int pound) {
		// TODO Auto-generated method stub
		return pound*453.592;
	}

	@Override
	public double convertPoundtoOunce(int pound) {
		// TODO Auto-generated method stub
		return pound*16;
	}

	@Override
	public double convertOuncetoPound(int ounce) {
		// TODO Auto-generated method stub
		return ounce/16;
	}
	

	

}
