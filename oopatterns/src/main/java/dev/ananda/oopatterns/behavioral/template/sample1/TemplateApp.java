package dev.ananda.oopatterns.behavioral.template.sample1;

public class TemplateApp {
    public static void main(String[] args) {
        Employee programmer = new Programmer();
        programmer.comeToWork();

        System.out.println();

        Employee manager = new Manager();
        manager.comeToWork();
    }
}
