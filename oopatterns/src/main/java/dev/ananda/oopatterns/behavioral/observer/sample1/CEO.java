package dev.ananda.oopatterns.behavioral.observer.sample1;

public class CEO extends Observer {

	public CEO(Programmer programmer) {
		this.programmer = programmer;
		this.programmer.attach(this);
	}

	@Override
	public void update() {
		if (this.programmer.getState().equalsIgnoreCase("Successful")) {
			System.out.println("CEO appreciates the Team..");
		} else {
			System.out.println("CEO gathers information and prepares strategic meet..");
		}
	}

}
