package Employees;
public abstract class employee{
    private String name;
    private String cpf;
    private double salary;

    public employee(){

    }

    public abstract double getBonus();

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}