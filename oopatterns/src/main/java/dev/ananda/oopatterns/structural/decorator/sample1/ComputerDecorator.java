package dev.ananda.oopatterns.structural.decorator.sample1;

public class ComputerDecorator implements Computer {
	protected Computer computer;

	public ComputerDecorator(Computer computer) {
		super();
		this.computer = computer;
	}

	@Override
	public void assemble() {
		this.computer.assemble();
	}

}
