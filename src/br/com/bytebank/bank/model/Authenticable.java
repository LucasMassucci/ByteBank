package br.com.bytebank.bank.model; 

public abstract interface Authenticable {


    public abstract void setPassword(int password);

    
    public abstract boolean authenticate(int password);
}

