package predo.patterns.prototype.step1;

/**
 * Created by predo1 on 15/08/16.
 */
public class CookieMachine {

    private SimpleCookie prototype;

    public CookieMachine(){
        this.prototype = new SimpleCookie();
    }

    public SimpleCookie makeCookie(){
        return (SimpleCookie) this.prototype.clone();
    }

}
