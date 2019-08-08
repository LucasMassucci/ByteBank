package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.*;

public class SystemTest {

    public static void main(String[] args) {
        
        Manager g = new Manager();
        g.setPassword(222);

        Administrator a = new Administrator();
        a.setPassword(333);

        InternalSystem si = new InternalSystem();
        si.authenticate(g);
        si.authenticate(a);

    }

}