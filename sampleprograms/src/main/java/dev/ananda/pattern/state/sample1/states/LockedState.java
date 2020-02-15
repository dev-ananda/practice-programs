package dev.ananda.pattern.state.sample1.states;

import dev.ananda.pattern.state.sample1.ui.Player;

public class LockedState extends State {

    public LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        return null;
    }

    @Override
    public String onPlay() {
        return null;
    }

    @Override
    public String onNext() {
        return null;
    }

    @Override
    public String onPrevious() {
        return null;
    }
}
