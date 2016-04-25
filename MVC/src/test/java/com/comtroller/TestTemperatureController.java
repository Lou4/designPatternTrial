package com.comtroller;

import com.controller.TemperatureController;
import com.model.TemperatureModel;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

/**
 * Created by predo1 on 25/04/16.
 */
public class TestTemperatureController {

    TemperatureController temperatureController;

    @Before
    public void setUp(){
        temperatureController = new TemperatureController();
    }

    @Test
    public void testController_setTemp(){
        temperatureController.changeTemperature(10);
        try {
            Field f = temperatureController.getClass().getDeclaredField("temperatureModel"); //NoSuchFieldException
            f.setAccessible(true);
            TemperatureModel model = (TemperatureModel)f.get(temperatureController);
            assertEquals(10,model.getTemperature());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
