package com.ship;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ship.WarShipFactory;

public class TestFactoryDuck {

	private AbstractFactoryShip factoryShip;
	
	@Before
	public void setUp(){
		factoryShip = WarShipFactory.getInstance();
	}
	
	@Test
	public void testIstantiateShip_className(){
		Ship normalWar = factoryShip.createNormal();
		Ship specialWar = factoryShip.createSpecial();
		
		assertEquals(normalWar.getClass().getSimpleName(), NormalWarShip.class.getSimpleName());
		assertEquals(specialWar.getClass().getSimpleName(), SpecialWarShip.class.getSimpleName());
	}

}
