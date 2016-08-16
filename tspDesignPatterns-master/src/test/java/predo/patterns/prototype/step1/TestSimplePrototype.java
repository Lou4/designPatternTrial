package predo.patterns.prototype.step1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by predo1 on 15/08/16.
 */
public class TestSimplePrototype {

    @Test
    public void testCookiePrototype(){
        CookieMachine cookieMachine = new CookieMachine();

        assertFalse(cookieMachine.makeCookie() == cookieMachine.makeCookie());
        
        String s1 = "ciao";
        String s2 = "ciao";
        
        assertTrue(s1.equals(s2));
        assertTrue(s1 == s2);
    }
}
