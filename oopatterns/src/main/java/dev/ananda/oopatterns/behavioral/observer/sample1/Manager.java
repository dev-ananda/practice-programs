package dev.ananda.oopatterns.behavioral.observer.sample1;

public class Manager extends Observer {

	public Manager(Programmer programmer) {
		this.programmer = programmer;
		this.programmer.attach(this);
	}

	@Override
	public void update() {
		if (this.programmer.getState().equalsIgnoreCase("Successful")) {
			System.out.println("Manager celebrates with the team..");
		} else {
			System.out.println("Manager connects with the team to collect the details..");
		}
	}

}
