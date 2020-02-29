package dev.ananda.oopatterns.behavioral.mediator.sample1;

public class User {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	public void sendMessage(String message) {
		Chat.showMessage(this, message);
	}
	
}
