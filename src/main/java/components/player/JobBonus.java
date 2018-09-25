package main.java.components.player;

/*
 * Description:
 * JobBonus is an array that specifies multipliers to each attribute
 * of a player given their Job.
 * 
 * Last Edited by Lung Yang on 9/21/2018
 */

public class JobBonus {
	private double[] array = new double[3];
	
	//array[0] = health, array[1] = strength, array[2] = defense
	public JobBonus() {
		array = new double[]{0,0,0};
	}
	
	public JobBonus(double hp, double str, double def) {
		array = new double[] {hp,str,def};
	}
	
	public double getHPMultiplier() {
		return array[0];
	}
	
	public double getSTRMultiplier() {
		return array[1];
	}
	
	public double getDEFMultiplier() {
		return array[2];
	}
	
	public String toString() {
		return array[0] + " Health, " + array[1] + " Strength, " + array[2] + " Defense";
	}
}
