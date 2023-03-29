package ru.top.adapter;
//Есть некие автомобили, которые имеют в качестве характеристики максимальную скорость в км в час.
//Клиент хочет получать информацию о скорости в милях в час.
//Нужно создать адаптер для преобразования.

public class Main {
    public static void main(String[] args) {
        Car ladaKalina = new Adapter();
        ladaKalina.getSpeedKilometer();
    }
}
