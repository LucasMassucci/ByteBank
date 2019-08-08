package br.com.bytebank.bank.model; 

public class LifeInsurance implements Taxable {

    @Override
    public double getTaxAmount() {
        return 42;
    }

}