package ru.top.state;
//Есть состояния задач - ожидает выполнения, в работе, на ревью и выполнена
//Нужно реализовать состояния с помощью паттерна State.
public interface Condition {
    void doSomething();
}
