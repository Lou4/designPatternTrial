package predo.patterns.prototype.step2;

import org.apache.commons.lang.SerializationUtils;

import java.io.Serializable;

/**
 * Created by predo1 on 15/08/16.
 */
public abstract class AbstractSimpleCookie implements CookieBiscuit,Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Object clone(){
        /*
        CookieBiscuit clone = null;
        try {
            clone = (CookieBiscuit) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/
        return SerializationUtils.deserialize(SerializationUtils.serialize(this));
    }
}
