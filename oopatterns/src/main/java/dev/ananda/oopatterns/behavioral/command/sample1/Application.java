package dev.ananda.oopatterns.behavioral.command.sample1;

public class Application {
	private String name =  "Computer Application";
	private int quantity = 2;
	
	public void make(){
		System.out.println(this.quantity + " application(s) are made for client.");
	}
	
	public void sell(){
		System.out.println(this.quantity + " application(s) are sold to the client.");
	}
}
