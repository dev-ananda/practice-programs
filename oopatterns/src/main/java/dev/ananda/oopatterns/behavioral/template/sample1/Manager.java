package dev.ananda.oopatterns.behavioral.template.sample1;

public class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Managing other employees....");
    }

    @Override
    void takePause() {
        System.out.println("Taking small break from managing employees....");
    }

    @Override
    void getPaid() {
        System.out.println("Getting paid for overseeing the development of the project.....");
    }
}
