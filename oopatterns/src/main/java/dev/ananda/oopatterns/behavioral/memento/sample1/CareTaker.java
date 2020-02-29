package dev.ananda.oopatterns.behavioral.memento.sample1;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> savedState = new ArrayList<>();
	
	public void saveState(Memento state) {
		this.savedState.add(state);
	}
	
	public Memento getState(int index){
		return this.savedState.get(index);
	}
}
