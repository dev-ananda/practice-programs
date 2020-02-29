package dev.ananda.oopatterns.creational.prototype.sample1;

public class Programmer extends Employee {
	public Programmer(){
		position = "Senior";
	}
	@Override
	public void work(){
		System.out.println("Writing code!");
	}
}
