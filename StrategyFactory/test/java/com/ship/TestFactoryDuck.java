package com.ship;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ship.FactoryShip;

public class TestFactoryDuck {

	private FactoryShip factoryShip;
	
	@Before
	public void setUp(){
		factoryShip = FactoryShip.getInstance();
	}
	
	@Test
	public void testIstantiateShip_className(){
		Ship normalWar = factoryShip.createNormalWarShip();
		Ship specialWar = factoryShip.createSpecialWarShip();
		
		assertEquals(normalWar.getClass().getSimpleName(), NormalWarShip.class.getSimpleName());
		assertEquals(specialWar.getClass().getSimpleName(), SpecialWarShip.class.getSimpleName());
	}

}
