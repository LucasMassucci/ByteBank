package Funcionarios;

public class Designer extends Funcionario {

    public double getBonificacao() {
        System.out.println("Método de bonificação do Designer");
        return getSalario() + 150;

    }

}