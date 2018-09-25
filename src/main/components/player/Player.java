package main.components.player;

/*
 * Description:
 * 
 * 
 * Last Edited by Lung Yang on 9/21/2018
 */

public class Player {
	private String name;
	private Job job;
	private static final int HP_LVLUP_MULTIPLIER = 10, STR_LVLUP_MULTIPLIER = 12, DEF_LVLUP_MULTIPLIER = 13; // the greater the value, the lower the stat growth
	private int base_hp, base_str, base_def,
				max_hp, max_str, max_def,
				current_hp, current_str, current_def,
				lvl;
	
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
	}
	
	public void statUpdate() {
		max_hp = (int) (base_hp * job.getHPMultiplier());
		max_str = (int) (base_str * job.getSTRMultiplier());
		max_def = (int) (base_def * job.getDEFMultiplier());
	}
	
	public void levelUp() {
		lvl++;
		base_hp += (int) (  (Math.log(lvl) * lvl)  +  (base_hp / (HP_LVLUP_MULTIPLIER*lvl))  );
		base_str += (int) (  (Math.log(lvl) * lvl)  +  (base_str / (STR_LVLUP_MULTIPLIER*lvl))  );;
		base_def += (int) (  (Math.log(lvl) * lvl)  +  (base_hp / (DEF_LVLUP_MULTIPLIER*lvl))  );;
		statUpdate();
		current_hp = max_hp;
		current_str = max_str;
		current_def = max_def;
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
