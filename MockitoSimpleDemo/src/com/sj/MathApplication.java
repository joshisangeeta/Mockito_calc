/**
 * 
 */
package com.sj;

/**
 * @author HP
 *
 */
public class MathApplication {

	CalcService calc;

	public CalcService getCalc() {
		return calc;
	}

	public void setCalc(CalcService calc) {
		this.calc = calc;
	}
	
	 public double invokeAdd(double x,double y) {
		 //return 30;
		
		 return calc.add(x, y);
		 
		 
	 }
	
	
}
