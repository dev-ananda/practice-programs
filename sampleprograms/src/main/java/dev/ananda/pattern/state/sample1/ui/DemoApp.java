package dev.ananda.pattern.state.sample1.ui;

public class DemoApp {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
