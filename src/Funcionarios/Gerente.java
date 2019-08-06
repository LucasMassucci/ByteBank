package Funcionarios;
public class Gerente extends Funcionario{
    private int senha;


    public double getBonificacao(){
        return (super.getSalario() + (super.getBonificacao() + 150));
    }

    
    public boolean autentica(int senha){
        if(this.senha == 222){
            return true;
        }else{
            return false;
        }
    }

}