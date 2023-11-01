package br.com.pyetro.observer;

import java.util.ArrayList;
import java.util.List;

public class Journalist implements Subject{

    public List<Observer> observers = new ArrayList<>();

    private String headline;
    @Override
    public void add(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyAll(String headline) {
        this.headline = headline;
        for (Observer ob : this.observers){
            ob.update(this);
        }

    }

    @Override
    public String toString() {
        return "Journalist {" + "headline= " + headline + "}";
    }
}
