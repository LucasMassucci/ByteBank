package Funcionarios;

public abstract class FuncionarioAutenticavel extends Funcionario {

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    
    public boolean autentica(int senha){
        if(this.senha == 222){
            return true;
        }else{
            return false;
        }
    }

}

