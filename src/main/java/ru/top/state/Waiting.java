package ru.top.state;

public class Waiting implements Condition{
    @Override
    public void doSomething() {
        System.out.println("Ожидает выполнения");
    }
}
