package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

public class EmployeeTest{
    public static void main(String[] args) {
        Manager nico = new Manager();
        nico.setNome("Nico Steppat");
        nico.setCpf("223463645-28");
        nico.setSalary(5000.0);
        
        Designer paulo = new Designer();
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("5482186757-5");
        paulo.setSalary(2400.0);
        
        System.out.println(nico.getName());
        System.out.println(nico.getBonus());

        System.out.println(paulo.getName());
        System.out.println(paulo.getBonus());
        
    }
}