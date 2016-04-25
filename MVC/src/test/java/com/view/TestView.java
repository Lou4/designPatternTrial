package com.view;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;

public class TestView {
 
	@Rule
	private SystemErrRule ser = new SystemErrRule().enableLog();
	
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
		assertEqual("30\n", ser.getLog());
	}
}
