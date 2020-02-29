package dev.ananda.oopatterns.behavioral.observer.sample1;

public class Main {
	public static void main(String[] args) {
		Programmer programmer = new Programmer();

		new CEO(programmer);
		new Manager(programmer);
		new TechLead(programmer);

		System.out.println("Programmer successfully did his job!");
		programmer.setState("Successful");
		System.out.println("Programmer failed his new assignment.");
		programmer.setState("Failed");
	}
}
