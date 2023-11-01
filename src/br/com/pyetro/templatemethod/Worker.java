package br.com.pyetro.templatemethod;

public abstract class Worker {
    public void execute() {
        wakeUp();
        routineStart();
        goToWork();
        work();
        backHome();
    }

    protected abstract void work();

    protected void backHome(){
        System.out.println("Getting back home");
    }

    protected void goToWork(){
        System.out.println("Going to work");
    }

    protected void routineStart(){
        System.out.println("Starting routine");
    }

    protected void wakeUp(){
        System.out.println("Waking up 8:00 AM");
    }
}
