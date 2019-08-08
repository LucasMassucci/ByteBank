package Employees;

public class Client implements Authenticable{
    
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
