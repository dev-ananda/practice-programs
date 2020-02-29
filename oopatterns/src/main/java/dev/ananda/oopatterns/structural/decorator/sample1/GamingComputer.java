package dev.ananda.oopatterns.structural.decorator.sample1;

public class GamingComputer extends ComputerDecorator {

	public GamingComputer(Computer computer) {
		super(computer);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.println("Adding characteristics of Gaming computer!");
	}

}
