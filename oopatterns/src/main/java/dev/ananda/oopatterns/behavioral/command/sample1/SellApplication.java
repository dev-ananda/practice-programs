package dev.ananda.oopatterns.behavioral.command.sample1;

public class SellApplication implements Order {
	private Application application;

	public SellApplication(Application application) {
		super();
		this.application = application;
	}

	@Override
	public void placeOrder() {
		application.sell();
	}

}
