package predo.patterns.prototype.step3;

/**
 * Created by predo1 on 15/08/16.
 */
public class Cookie5ChocolateDots extends CookieWithDots{
    public Cookie5ChocolateDots(){
        super();
        this.addFlavourDot(new ChocolateDot());
        this.addFlavourDot(new ChocolateDot());
        this.addFlavourDot(new ChocolateDot());
        this.addFlavourDot(new ChocolateDot());
        this.addFlavourDot(new ChocolateDot());
    }
}
