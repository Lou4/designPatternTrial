package predo.patterns.prototype.step3;

import org.junit.Test;
import predo.patterns.prototype.step2.AbstractSimpleCookie;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by predo1 on 15/08/16.
 */
public class TestComplexObjectPrototype {

    @Test
    public void testStabucksCookie(){
        Cookie5ChocolateDots cookie5ChocolateDots = new Cookie5ChocolateDots();
        Starbucks starbucks = new Starbucks(cookie5ChocolateDots);

        CookieWithDots cookieWithDots1 = starbucks.makeCookie();
        CookieWithDots cookieWithDots2 = starbucks.makeCookie();

        assertFalse(cookieWithDots1.equals(cookieWithDots2));

        printPrototypeProperties(cookieWithDots1);
        printPrototypeProperties(cookieWithDots2);

    }

    private void printPrototypeProperties(CookieWithDots cookie){

        System.out.println("|- Object Hash: " + System.identityHashCode(cookie) + " -|");
        try {
            Field dotsField = cookie.getClass().getSuperclass().getDeclaredField("dots");
            dotsField.setAccessible(true);
            ArrayList<AbstractDot> dots = (ArrayList<AbstractDot>) dotsField.get(cookie);

            System.out.println("|- Dots List Hash: " + System.identityHashCode(dots) + " -|");

            for(AbstractDot dot : dots){
                System.out.println("|- Dot : " + dot + " - hash : "+ System.identityHashCode(dot) +" -|");
            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n");

    }
}
