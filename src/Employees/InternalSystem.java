package Employees;

public class InternalSystem {

    private int password = 2222;

    public void authenticate(Authenticable fa) {
        boolean authenticated = fa.authenticate(this.password);
        if(authenticated) {
            System.out.println("Access allowed");

        } else {
            System.out.println("Access denied");
        }
     }

}