package predo.patterns.prototype.step3;

/**
 * Created by predo1 on 15/08/16.
 */
public class Starbucks {

    private CookieWithDots prototype;

    public Starbucks(CookieWithDots prototype){
        this.prototype = prototype;
    }

    public CookieWithDots makeCookie(){
        return (CookieWithDots) this.prototype.clone();
    }
}
