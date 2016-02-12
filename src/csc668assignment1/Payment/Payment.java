/*
 * Only a stub for now
 */
package csc668assignment1.Payment;

/**
 *
 * @author axelanconaesselmann
 */
public abstract class Payment {
    protected float _ammount;
    protected String _type;
    
    public String getAmmount() {
        return "$" + Float.toString(_ammount);
    }
    public void setAmmount(float ammount) {
        _ammount = ammount;
    }
    public String getType() {
        return _type;
    }
}
