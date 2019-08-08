package Funcionarios;

public class ClienteTst implements Autenticavel{
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
}
