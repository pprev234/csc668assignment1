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
public class CreditPayment extends Payment {
    private String _cardNbr;
    public CreditPayment(String cardNbr) {
        _type    = "CREDIT";
        _cardNbr = cardNbr;
    }
    @Override
    public String toString() {
        return "<" + _type + " " + _cardNbr + ">";
    }
}
