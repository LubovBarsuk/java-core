package ru.top.state;

public class Operation {
    Condition condition;

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void changeCondition() {
        if (condition instanceof Waiting) {
            setCondition(new Work());
        } else if (condition instanceof Work) {
            setCondition(new Review());
        } else if (condition instanceof Review) {
            setCondition(new Completed());
        } else if (condition instanceof Completed) {
            setCondition(new Waiting());
        }
    }

    public void doSomething(){
        condition.doSomething();
    }
}
