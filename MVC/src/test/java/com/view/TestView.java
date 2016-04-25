package com.view;

import org.junit.Before;
import org.junit.Test;

public class TestView {
 
	private TemperatureView temperatureView;
	
	@Before 
	public void setup(){
		temperatureView = new TemperatureView();
	}
	
	@Test
	public void testView_checkValueTemperature(){
		temperatureView.createView();
		temperatureView.performChangeTemperatureAction(30);
		int actual = temperatureView.getGrapichElementTemperatureValue();
		
		assertEquals(30, actual);
	}
}
