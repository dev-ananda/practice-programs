package dev.ananda.oopatterns.behavioral.command.sample1;

public class CommandRunner {
	public static void main(String[] args) {
		Application application = new Application();
		
		Programmer programmer =  new Programmer();
		programmer.takeOrder(new MakeApplication(application));
		programmer.takeOrder(new SellApplication(application));
		
		programmer.placeOrders();
	}
}
