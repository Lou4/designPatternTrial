package predo.patterns.prototype.step2;

/**
 * Created by predo1 on 15/08/16.
 */
public class ArnoldCoffee {
    private AbstractSimpleCookie prototype;

    public ArnoldCoffee(AbstractSimpleCookie p){
        this.prototype = p;
    }

    public CookieBiscuit makeCookie(){
        return (AbstractSimpleCookie) this.prototype.clone();
    }
}
