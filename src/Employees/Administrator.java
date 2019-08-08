package Employees;

public class Administrator extends employee implements Authenticable{

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

    @Override
    public double getBonus() {
        return 50;
    }

    
}