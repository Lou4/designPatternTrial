package com.view;

import com.model.TemperatureModel;

import javax.swing.*;
import java.awt.*;

public class TemperatureView {

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
}
