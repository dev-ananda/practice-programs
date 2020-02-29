package dev.ananda.oopatterns.structural.decorator.sample1;

public class Main {
	public static void main(String[] args) {
		Computer computer = new BasicComputer();
		
		Computer gamingComputer = new GamingComputer(computer);
		gamingComputer.assemble();
		
		System.out.println();
		
		Computer workstation = new Workstation(computer);
		workstation.assemble();
	}
	
}
