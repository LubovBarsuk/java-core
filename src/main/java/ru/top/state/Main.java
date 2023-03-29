package ru.top.state;

//Есть состояния задач - ожидает выполнения, в работе, на ревью и выполнена
//Нужно реализовать состояния с помощью паттерна State.
public class Main {
    public static void main(String[] args) {

        Condition condition = new Waiting();
        Operation operation = new Operation();

        operation.setCondition(condition);

        for (int i = 0; i < 10; i++) {
            operation.doSomething();
            operation.changeCondition();
        }
    }
}
