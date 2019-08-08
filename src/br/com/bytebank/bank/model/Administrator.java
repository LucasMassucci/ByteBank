package br.com.bytebank.bank.model; 

public class Administrator extends employee implements Authenticable{

    private UsefulAuthentication authenticator; 

    public Administrator(){
        this.authenticator = new UsefulAuthentication();
    }

    @Override
    public void setPassword(int password) {
        this.authenticator.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        boolean authenticated = this.authenticator.authenticate(password);
        return authenticated;    
    }


    @Override
    public double getBonus() {
        return 50;
    }

    
}