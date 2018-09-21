package main.components.player;
import java.awt.Color;

/*
 * Description:
 * 
 * 
 * Last Edited by Lung Yang on 9/21/2018
 */

public class Warrior extends Job{
	private static final String TITLE = "Warrior";
	private static final double HP = 1.8, STR = 1.2, DEF = 1.5;
	private static final Color INDICATOR = new Color(255,0,0);
	private static final JobBonus BONUS = new JobBonus(HP,STR,DEF);
	
	public Warrior() {
		super(TITLE, BONUS);
	}
	
	public Warrior(boolean ind) {
		super(TITLE, BONUS);
		if(ind) super.indicator=INDICATOR;
	}
}
