package main.components;
import java.awt.Color;

public class Job {
	private String title;
	private JobBonus bonus;
	private Color indictator;
	
	public Job() {
		this.title = "Nobody";
		this.bonus = new JobBonus();
		this.indictator = new Color(0,0,0);
	}
	
	public Job(String t, JobBonus b, Color ind) {
		this.title = t;
		this.bonus = b;
		this.indictator = ind;
	}
}
