/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc668assignment1.Payments;

import csc668assignment1.Payments.Payment;

/**
 *
 * @author axelanconaesselmann
 */
public class CashPayment extends Payment {
    public CashPayment(float ammount) {
        _type = "CASH/CHECK";
        setAmmount(ammount);
    }
    @Override
    public String toString() {
        return "<" + _type + " " + this.getAmmount() + ">";
    }
}
