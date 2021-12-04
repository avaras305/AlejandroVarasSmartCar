/**
 * 
 */
package com.SmartCarClassDiagram;

import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author varas
 *
 */
public class SmartCar {
	
	private String unlock;
	private ElectricMotor myelectricmotor;
	
	public SmartCar() {
		unlock = "Car Door Opens";
	}
	
	private String smartCarLicensePlateNumber;
	
	private String smartCarYear;
	
	public void goForward() {
	}
	
	public void goBackward() {
	}
	
	public void goRight() {
		
	}
	
	public void goLeft() {
		
	}
	
	public void stop() {
		
	}
	
	public void park() {
		
	}
	
	public void systemDiagnostics() {
		
	}
	
	public boolean selfCheck() {
		return SelfCheckUtils.randomCheck();
	}
	
	public boolean runSelfCheck() {
		return SelfCheckUtils.checkComponents(null);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
