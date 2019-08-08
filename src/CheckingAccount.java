
public class CheckingAccount extends Account implements Taxable {

    public CheckingAccount(int agency, int number){
        super(agency, number); 

    }

    @Override
    public double getTaxAmount() {
        return super.getBalance() * 0.01;
    }

    @Override
    public boolean withdraw(double value) {
        double valueToWithdraw = value + 0.20;
        return super.withdraw(valueToWithdraw);
    }

    
}