package predo.patterns.prototype.step2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by predo1 on 15/08/16.
 */
public class TestAbstractPrototype {

    @Test
    public void testArnoldCoffee(){
        ChocolateCookie cookie = new ChocolateCookie();
        ArnoldCoffee arnoldCoffee = new ArnoldCoffee(cookie);

        assertFalse(arnoldCoffee.equals(arnoldCoffee.makeCookie()));

    }
}
