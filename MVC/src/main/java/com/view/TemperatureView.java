package com.view;

import com.model.TemperatureModel;

import javax.swing.*;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class TemperatureView implements Observer{

    private TemperatureTextFieldView window;

    private TemperatureModel model;

    public void createView() {
        window = new TemperatureTextFieldView();
    }

    public void performChangeTemperatureAction(int i) {
        model.setTemperature(i);
    }

    public int getGrapichElementTemperatureValue() {
        return window.getTextFieldValue();
    }

	public void update(Observable o, Object arg) {
		
		
	}
}
