package main.components.player;
import java.awt.Color;

/*
 * Description:
 * 
 * 
 * Last Edited by Lung Yang on 9/21/2018
 */

public abstract class Job {
	protected String title;
	protected JobBonus bonus;
	protected Color indicator;
	
	public Job() {
		this.title = "Nobody";
		this.bonus = new JobBonus();
		this.indicator = new Color(0,0,0);
	}
	
	public Job(String t, JobBonus b) {
		this.title = t;
		this.bonus = b;
	}
	
	public Job(String title, JobBonus bonus, Color ind) {
		this.title = title;
		this.bonus = bonus;
		this.indicator = ind;
	}
	
	public double getHPMultiplier() {
		return this.bonus.getHPMultiplier();
	}
	
	public double getSTRMultiplier() {
		return this.bonus.getSTRMultiplier();
	}
	
	public double getDEFMultiplier() {
		return this.bonus.getDEFMultiplier();
	}
	
	public Color getIndicator() {
		return this.indicator;
	}
}
