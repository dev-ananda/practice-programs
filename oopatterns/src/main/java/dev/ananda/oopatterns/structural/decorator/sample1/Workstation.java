package dev.ananda.oopatterns.structural.decorator.sample1;

public class Workstation extends ComputerDecorator {

	public Workstation(Computer computer) {
		super(computer);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding characteristics of Workstation!!");
	}

}
