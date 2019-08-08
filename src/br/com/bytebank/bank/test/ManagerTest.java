package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

public class ManagerTest{
    public static void main(String[] args) {
        Manager g1 = new Manager();
        g1.setNome("Marco");
        g1.setCpf("134889458-45");
        g1.setSalary(5000.0);

        System.out.println(g1.getName());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalary());
        
       System.out.println(g1.authenticate(22540));
       System.out.println(g1.getBonus());



    }
}