package dev.ananda.oopatterns.behavioral.command.sample1;

public class MakeApplication implements Order {
	private Application application;

	public MakeApplication(Application application) {
		super();
		this.application = application;
	}

	@Override
	public void placeOrder() {
		application.make();
	}

}
