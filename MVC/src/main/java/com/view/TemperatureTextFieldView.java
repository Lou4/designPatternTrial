package com.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by predo1 on 25/04/16.
 */
public class TemperatureTextFieldView extends JFrame{


    private TextField temperatureTextField;

    public TemperatureTextFieldView(){
        Container rootContainer = this.getContentPane();
        rootContainer.setLayout(new GridLayout(1, 1, 10, 10));
        this.setBounds(100,100,150,80);

        temperatureTextField = new TextField();
        temperatureTextField.setColumns(1);

        rootContainer.add(temperatureTextField);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public int getTextFieldValue(){
        return Integer.parseInt(this.temperatureTextField.getText());
    }
}
