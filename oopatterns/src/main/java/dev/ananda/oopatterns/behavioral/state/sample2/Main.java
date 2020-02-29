package dev.ananda.oopatterns.behavioral.state.sample2;

public class Main {
	public static void main(String[] args) {
		Context context = new Context();

		ApplicationStart start = new ApplicationStart();
		start.doAction(context);

		System.out.println(context.getState());

		ApplicationFinish finish = new ApplicationFinish();
		finish.doAction(context);

		System.out.println(context.getState());

	}
}
