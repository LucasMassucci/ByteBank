package br.com.bytebank.bank.model; 

public class Client implements Authenticable{
    private String name;
    private String cpf;
    private String occupation;
    private double income;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }


    













    private UsefulAuthentication Authenticator;

    public Client() {
        this.Authenticator = new UsefulAuthentication();

    }

    
    @Override
    public void setPassword(int password) {
        this.Authenticator.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        boolean authenticated = this.Authenticator.authenticate(password);
        return authenticated;    
    }
}
