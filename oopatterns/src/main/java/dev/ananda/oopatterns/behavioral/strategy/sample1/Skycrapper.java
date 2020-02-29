package dev.ananda.oopatterns.behavioral.strategy.sample1;

public class Skycrapper implements Strategy {

	@Override
	public String build(String location) {
		return "Building a skyscraper in the " + location + " area.";
	}

}
