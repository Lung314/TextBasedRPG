package main.components;
import java.awt.Color;

public class Warrior extends Job{
	private static final String TITLE = "Warrior";
	private static final int HP = 3, STR = 2, DEF = 3;
	private static final Color INDICATOR = new Color(255,0,0);
	private static final JobBonus BONUS = new JobBonus(HP,STR,DEF);
	
	public Warrior() {
		super(TITLE, BONUS);
	}
	
	public Warrior(boolean ind) {
		super(TITLE, BONUS);
		
		if(ind) setIndicator(INDICATOR);
	}
}
