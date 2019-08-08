package Employees;
public class BonusControl{

    private double sum;
    public void registra(employee f) {
        double bonus = f.getBonus();
        this.sum = this.sum + bonus;
    }
    
    public double getSum() {
        return sum;
    }

}