package main.java.components.player;
import main.java.components.Entity;

/*
 * Description:
 * 
 * 
 * Last Edited by Lung Yang on 9/25/2018
 */

public class Player extends Entity {
	private Job job;
	private static final int 	HP_LVLUP_MULTIPLIER = 10, 
								STR_LVLUP_MULTIPLIER = 12, 
								DEF_LVLUP_MULTIPLIER = 13; 
								// the greater the value, the lower the stat growth
	private int base_hp, base_str, base_def,
				lvl, current_exp, max_exp;
	
	////////////////
	//Constructors//
	////////////////
	
	public Player() {
		this("Lung", new Warrior());
	}
	
	public Player (String name, Job job) {
		this.name = name;
		this.job = job;
		base_hp = 10;
		base_str = 2;
		base_def = 2;
		statUpdate();
		lvl = 1;
		current_exp = 0;
		max_exp = 10;
	}
	
	//////////////////////
	//Functional Methods//
	//////////////////////
	
	public void statUpdate() {
		max_hp = (int) (base_hp * job.getHPMultiplier());
		max_str = (int) (base_str * job.getSTRMultiplier());
		max_def = (int) (base_def * job.getDEFMultiplier());
	}
	
	public void levelUp() {
		lvl++;
		max_exp *= lvl;
		base_hp += (int) statGrowth(base_hp, HP_LVLUP_MULTIPLIER);
		base_str += (int) statGrowth(base_str, STR_LVLUP_MULTIPLIER);;
		base_def += (int) statGrowth(base_def, DEF_LVLUP_MULTIPLIER);;
		statUpdate();
		current_hp = max_hp;
		current_str = max_str;
		current_def = max_def;
	}
	
	//add exp and resets exp count, triggering a level up and increased max_exp
	public void addEXP(int exp) {
		current_exp += exp;
		
		if(current_exp >= max_exp) {
			current_exp %= max_exp;
			levelUp();
		}
	}
	
	// level up growth equation
	public double statGrowth(int stat, int multiplier) {
		return (Math.log(lvl) * lvl)  +  (stat / (multiplier*lvl));
	}
	
	//////////////////
	//Getter Methods//
	//////////////////
	
	public Job getJob() {
		return job;
	}
	
	public int getLvl() {
		return lvl;
	}
	
	public int getMaxEXP() {
		return max_exp;
	}
	
	public int getCurrentEXP() {
		return current_exp;
	}
}
