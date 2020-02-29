package dev.ananda.oopatterns.behavioral.mediator.sample1;

public class Main {
	public static void main(String[] args) {
		User david = new User("David");
		User scott = new User("Scott");
		
		david.sendMessage("Hey scott! How are you");
		
		scott.sendMessage("I'm grreat !! Thank you. How are you!?");
	}
}
