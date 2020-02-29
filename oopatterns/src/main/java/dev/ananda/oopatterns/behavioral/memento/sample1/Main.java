package dev.ananda.oopatterns.behavioral.memento.sample1;

import java.text.MessageFormat;

public class Main {
	public static void main(String[] args) {
		Originator originator = new Originator();

		CareTaker careTaker = new CareTaker();

		MessageFormat format = new MessageFormat("State {0} at {1}");

		Object[] msgArgs = { 1, System.currentTimeMillis() };

		originator.setState(format.format(msgArgs));
		System.out.println("Current State : " + originator.getState());
		
		
		msgArgs[0] = 2;
		msgArgs[1] = System.currentTimeMillis();
		originator.setState(format.format(msgArgs));
		System.out.println("Current State : " + originator.getState());

		careTaker.saveState(originator.saveState());

		msgArgs[0] = 3;
		msgArgs[1] = System.currentTimeMillis();
		originator.setState(format.format(msgArgs));
		System.out.println("Current State : " + originator.getState());
		careTaker.saveState(originator.saveState());
		
		System.out.println("After restore [0]");
		originator.restoreState(careTaker.getState(0));
		System.out.println("Current State : " + originator.getState());
		
		System.out.println("After restore [1]");
		originator.restoreState(careTaker.getState(1));
		System.out.println("Current State : " + originator.getState());
		

	}
}
