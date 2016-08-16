package predo.patterns.prototype.step3;

import java.io.Serializable;

/**
 * Created by predo1 on 15/08/16.
 */
public class Flavour implements Serializable{

    private String flavour;

    private Flavour(String flavour){
        this.flavour = flavour;
    }

    public static final Flavour CHOCOLATE = new Flavour("Chocolate");
    public static final Flavour VANILLA = new Flavour("Vanilla");
    public static final Flavour CINNAMON = new Flavour("Cinnamon");
    public static final Flavour GINGER = new Flavour("Ginger");

    public String getFlavour(){
        return this.flavour;
    }
}
