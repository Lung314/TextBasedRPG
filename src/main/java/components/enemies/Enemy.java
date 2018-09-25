package main.java.components.enemies;
//import java.awt.Color;

/*
 * Description:
 * 
 * 
 * Last Edited by Lung Yang on 9/25/2018
 */

public abstract class Enemy {
	protected String name;
	protected int max_hp, max_str, max_def,
					current_hp, current_str, current_def;
	//FUTURE ADD IN, MAYBE?//protected Color indicator;
	
	////////////////
	//Constructors//
	////////////////
	
	public Enemy(){
		this("Hengy",1,1,1);
	}
	
	public Enemy(String name, int hp, int str, int def){
		this.name = name;
		max_hp = hp;
		max_str = str;
		max_def = def;
		fullHeal();
	}
	
	//////////////////
	//Getter Methods//
	//////////////////
	
	public int getHP() {
		return hp;
	}
	
	public int getSTR() {
		return str;
	}
	
	public int getDEF() {
		return def;
	}
	
	public String toString() {
		return name;
	}
	
}
