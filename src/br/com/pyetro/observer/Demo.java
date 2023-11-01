package br.com.pyetro.observer;

public class Demo {
    public static void main(String[] args){
        Journalist jour = new Journalist();
        jour.add(new Tv());
        jour.notifyAll("Test");
    }
}

