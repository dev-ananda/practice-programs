package dev.ananda.oopatterns.behavioral.state.sample2;

public class ApplicationFinish implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Application is in the finishing state of development..");
		context.setState(this);
	}

	@Override
	public String toString(){
		return "Finishing state..";
	}
	
}
