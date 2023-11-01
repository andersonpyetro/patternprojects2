package br.com.pyetro.observer;

public class Tv implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("Receiving news through TV "+ subject.toString());

    }
}
