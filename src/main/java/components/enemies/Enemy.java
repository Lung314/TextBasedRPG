package main.java.components.enemies;
import main.java.components.Entity;
//import java.awt.Color;

/*
 * Description:
 * 
 * 
 * Last Edited by Lung Yang on 9/25/2018
 */

public abstract class Enemy extends Entity{
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
}
