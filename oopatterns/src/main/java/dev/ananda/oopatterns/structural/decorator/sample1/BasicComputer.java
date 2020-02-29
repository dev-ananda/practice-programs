package dev.ananda.oopatterns.structural.decorator.sample1;

public class BasicComputer implements Computer {

	@Override
	public void assemble() {
		System.out.println("Assembling a basic computer layout.");
	}

}
