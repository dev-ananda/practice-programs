package dev.ananda.oopatterns.behavioral.strategy.sample1;

public class Home implements Strategy {

	@Override
	public String build(String location) {
		return "Building a house in the " + location + " area.";
	}

}
