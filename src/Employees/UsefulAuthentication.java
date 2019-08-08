package Employees;

public class UsefulAuthentication {

    private int password; 
    
    public void setPassword(int password) {
        this.password = password;
    }

    public boolean authenticate(int password) {
            if(this.password == 222){
                return true;
            }else{
                return false;
            }
    }



}