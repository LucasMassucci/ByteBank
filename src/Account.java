public abstract class Account {
    private double balance;
    private int agency;
    private int number;
    private Client holder;
    private static int total = 0;

    public Account(int agency, int number){
        System.out.println("Creating Account");
        Account.total++;
        this.agency = agency;
        this.number = number;
    }

    public void deposit(double value){
        balance += value; 
    }

    public boolean withdraw(double value){
        if(value <= balance){
            balance -= value;
            return true;
        }
        return false;
    }

    public boolean Transfer(double value, Account destiny){
        if(value <= balance){
            withdraw(value);
            destiny.deposit(value);
            return true;
        }else{
            return false;}
        }
       
    public double getBalance(){
        return balance; 
    }

  
    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAgency() {
        return agency;
    }

    public void setNumber(int number) {
        this.number = number;
    }
   
    public int getNumber() {
        return number;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public Client getHolder() {
        return holder;
    }
    public static int getTotal(){
        return Account.total;
    }
}