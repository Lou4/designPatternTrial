package com.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestModel {

	private TemperatureModel temperatureModel;
	
	@Before
	public void setUp(){
		temperatureModel = new TemperatureModel();
	}
	
	@Test
	public void testModel_init(){
		temperatureModel.setTemperature(10);
		assertEquals(10, temperatureModel.getTemperature());
	}
	
}
