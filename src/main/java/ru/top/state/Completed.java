package ru.top.state;

public class Completed implements Condition{
    @Override
    public void doSomething() {
        System.out.println("Выполнено");
    }
}
