package main.components;

public class JobBonus {
	private int[] array = new int[3];
	
	//array[0] = health, array[1] = strength, array[2] = defense
	public JobBonus() {
		array = new int[]{0,0,0};
	}
	
	public JobBonus(int hp, int str, int def) {
		array = new int[] {hp,str,def};
	}
	
	public String toString() {
		return array[0] + " Health, " + array[1] + " Strength, " + array[2] + " Defense";
	}
}
