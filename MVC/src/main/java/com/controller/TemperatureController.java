package com.controller;

import com.model.TemperatureModel;

public class TemperatureController {

	private TemperatureModel temperatureModel;
	
	public TemperatureController() {
		temperatureModel = new TemperatureModel();
	}
	
	public void changeTemperature(int newTemperature){
		temperatureModel.setTemperature(newTemperature);
	}
}
