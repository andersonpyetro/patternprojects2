package br.com.pyetro.templatemethod;

public class Lawyer extends Worker{
    @Override
    protected void work() {
        System.out.println("Working as Laywer");

    }

    protected void backHome(){
        System.out.println("Getting back home after review some subpoena papers.");
    }
}
