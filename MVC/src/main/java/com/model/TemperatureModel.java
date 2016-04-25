package com.model;

import java.util.Observable;

public class TemperatureModel extends Observable {

    private Integer temperature;

    public TemperatureModel(){
        this.temperature = 0;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
    	this.setChanged();
        this.temperature = temperature;
        this.notifyObservers(temperature);
    }
}
