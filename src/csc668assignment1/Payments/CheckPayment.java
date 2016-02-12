/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1.Payments;

/**
 *
 * @author axelanconaesselmann
 */
public class CheckPayment extends Payment {
    public CheckPayment(float ammount) {
        _type = "CHECK";
        setAmmount(ammount);
    }
    @Override
    public String toString() {
        return _type + " " + this.getAmmount();
    }
}
