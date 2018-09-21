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
	private int hp, str, def;
	
	public Player() {
		this.name = "Lung";
		this.job = new Warrior();
		hp = 10;
		str = 2;
		def = 2;
	}
	
	public Player (String name, Job job) {
		this();
		this.name = name;
		this.job = job;
	}
}
