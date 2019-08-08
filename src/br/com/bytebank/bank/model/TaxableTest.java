package br.com.bytebank.bank.model; 

public class TaxableTest {

    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(222, 333);
        ca.deposit(100.0);

        LifeInsurance insurance = new LifeInsurance();
        
        TaxCalculator calc = new TaxCalculator();
        calc.record(ca);
        calc.record(insurance);

        System.out.println(calc.getTaxAmount());
    }

} 