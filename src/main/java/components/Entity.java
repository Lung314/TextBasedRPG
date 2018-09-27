package main.java.components;

/*
 * Description:
 * The basic functionality and variables held by all entities
 * 
 * Last Edited by Lung Yang on 9/27/2018
 */

public abstract class Entity {
	protected String name;
	protected int max_hp, max_str, max_def,
	current_hp, current_str, current_def;
	
	public void fullHeal() {
		current_hp = max_hp;
		current_str = max_str;
		current_def = max_def;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMaxHP() {
		return max_hp;
	}
	
	public int getCurrentHP() {
		return current_hp;
	}
	
	public int getMaxSTR() {
		return max_str;
	}
	
	public int getCurrentSTR() {
		return current_str;
	}
	
	public int getMaxDEF() {
		return max_def;
	}
	
	public int getCurrentDEF() {
		return current_def;
	}
}
