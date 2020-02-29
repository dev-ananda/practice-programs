package dev.ananda.oopatterns.behavioral.observer.sample1;

public class TechLead extends Observer {

	public TechLead(Programmer programmer) {
		this.programmer = programmer;
		this.programmer.attach(this);
	}

	@Override
	public void update() {
		if (this.programmer.getState().equalsIgnoreCase("Successful")) {
			System.out.println("Lead programmer accompanies the team celebration.");
		} else {
			System.out.println("Lead programmer gathers missing information..");
		}
	}

}
