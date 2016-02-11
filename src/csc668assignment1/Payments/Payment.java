/*
 * Only a stub for now
 */
package csc668assignment1.Payments;

/**
 *
 * @author axelanconaesselmann
 */
public abstract class Payment {
    private float _ammount;
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
