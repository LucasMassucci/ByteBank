
public class AccountTest{
    public static void main(String[] args) {

        CheckingAccount cc = new CheckingAccount(111, 111);
        cc.deposit(100.0);

        SavingsAccount cp = new SavingsAccount(222, 222);
        cp.deposit(200.0);

        cc.Transfer(10.0, cp);

        System.out.println("CC: " + cc.getBalance());
        System.out.println("CP: " + cp.getBalance());
        

    }
}