package dev.ananda.oopatterns.behavioral.state.sample1.states;

import dev.ananda.oopatterns.behavioral.state.sample1.ui.Player;

public abstract class State {

    protected Player player;

    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();

    public abstract String onPlay();

    public abstract String onNext();

    public abstract String onPrevious();
}
