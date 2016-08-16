package predo.patterns.prototype.step3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.SerializationUtils;

/**
 * Created by predo1 on 15/08/16.
 */
public abstract class CookieWithDots implements Cloneable, Serializable {

    private List<AbstractDot> dots;

    public CookieWithDots(){
        this.dots = new ArrayList<AbstractDot>();
    }

    public void addFlavourDot(AbstractDot dot){
        this.dots.add(dot);
    }

    public String toString(){
        StringBuilder toString = new StringBuilder();
        toString.append("This cookie has ");
        toString.append(this.dots.size());
        toString.append(" dots!");
        return toString.toString();
    }

    public CookieWithDots clone(){
        return (CookieWithDots) SerializationUtils.clone(this);
    }
}
