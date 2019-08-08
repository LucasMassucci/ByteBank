package Funcionarios;
public class Gerente extends Funcionario implements Autenticavel{
    private int senha; 

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
            if(this.senha == 222){
                return true;
            }else{
                return false;
            }
    
    }

    @Override
    public double getBonificacao() {
        return 0;
    }
}