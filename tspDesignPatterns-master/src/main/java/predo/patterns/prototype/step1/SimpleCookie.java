package predo.patterns.prototype.step1;

/**
 * Created by predo1 on 15/08/16.
 */
public class SimpleCookie implements Cloneable {

    public Object clone(){
        SimpleCookie clone = null;
        try {
            clone = (SimpleCookie)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
