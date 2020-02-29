package dev.ananda.oopatterns.behavioral.strategy.sample1;

public class Main {
	public static void main(String[] args) {

		BuildContext context = new BuildContext(new Skycrapper());
		System.out.println("Requesting a Skyscrapper : " + context.executeStrategy("North Bengaluru"));

		context = new BuildContext(new Home());
		System.out.println("Requesting a House : " + context.executeStrategy("Outskirts"));

		context = new BuildContext(new Mall());
		System.out.println("Requesting a Mall : " + context.executeStrategy("Ring Road"));
	}
}
