package com.fdmgroup.icode.metrics;

import org.springframework.stereotype.Service;

@Service
public class MetricsService {

	public ResultDto convertMetersFeet(String unit, double value) {
		/*
			Method should be able to convert from meters to feet and feet to meters
			You will check to see which direction the conversion is going
				You will make use of built in String methods
			then you will calculate the result -- setting the result in the ResultDto object
				result = value * conversionRate
			Ensure to set the appropriate convertedUnit and fromUnit
				convertedUnit - what unit did you convert to?
				fromUnit - what unit did you convert from
		*/
		ResultDto rdto = new ResultDto();
		/*** You can set the code on lines 22 and 23 as a final else block 
		 * -- default if no conversion is needed****/
		rdto.result = value; 
		rdto.convertedUnit = "Unchanged"; 
		return rdto;
	}

	public ResultDto convertMetersKilometers(String unit, double value) {
		/** Similar logic from the above method can be applied here ***/
		ResultDto rdto = new ResultDto();
		rdto.result = value; 
		rdto.convertedUnit = "Unchanged";
		return rdto;
	}

	/*********** Create method that converts between Centimeters and Meters ***********/
	
	/*********** Create method that converts between Kg and Pounds ***********/

}
