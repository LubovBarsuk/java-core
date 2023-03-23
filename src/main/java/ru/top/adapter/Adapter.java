package ru.top.adapter;

public class Adapter extends SpeedMileIndication implements Car{
    @Override
    public void getSpeedKilometer() {
        getSpeedMile();
    }
}
