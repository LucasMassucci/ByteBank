package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

public class ReferenceTest{
    public static void main(String[] args) {
        Manager g1 = new Manager();
        g1.setNome("Marcos");
        g1.setSalary(5000.0);;


        Manager f1 = new Manager();
        f1.setNome("Nico");
        f1.setSalary(2500.0);

        BonusControl Control = new BonusControl();
        Control.registra(g1);
        Control.registra(f1);

        System.out.println(Control.getSum());
    }

}