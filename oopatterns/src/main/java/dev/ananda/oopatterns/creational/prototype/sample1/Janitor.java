package dev.ananda.oopatterns.creational.prototype.sample1;

public class Janitor extends Employee {

	public Janitor(){
		position = "Part-time";
	}
	
	@Override
	void work() {
		System.out.println("Cleaning the hallway!");
	}

}
