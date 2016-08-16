package predo.patterns.prototype.step3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by predo1 on 15/08/16.
 */
public abstract class AbstractDot implements Serializable{
    private Flavour flavour;
    public AbstractDot(Flavour flavour){
        this.flavour = flavour;
    }

    public String toString(){
        return "Dot whit " + this.flavour.getFlavour() + "flavour";
    }
}
