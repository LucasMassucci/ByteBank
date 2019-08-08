package Employees;

public class Client implements Authenticable{
    private int password; 

    
    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(int password) {
            if(this.password == 222){
                return true;
            }else{
                return false;
            }
    
    }
}
