package Employees;

public class Designer extends employee {

    public double getBonus() {
        System.out.println("Designer's bonus method");
        return getSalary() + 150;

    }

}