package com.fdmgroup.icode.metrics;

public class ResultDto {

	 double result=0;
     String convertedUnit="";
     String fromUnit="";
	public ResultDto(double result, String convertedUnit, String fromUnit) {
		super();
		this.result = result;
		this.convertedUnit = convertedUnit;
		this.fromUnit = fromUnit;
	}
	public ResultDto() {
		super();
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public String getConvertedUnit() {
		return convertedUnit;
	}
	public void setConvertedUnit(String convertedUnit) {
		this.convertedUnit = convertedUnit;
	}
	public String getFromUnit() {
		return fromUnit;
	}
	public void setFromUnit(String fromUnit) {
		this.fromUnit = fromUnit;
	}
	@Override
	public String toString() {
		return "ResultDto [result=" + result + ", convertedUnit=" + convertedUnit + ", fromUnit=" + fromUnit + "]";
	}
    
}
