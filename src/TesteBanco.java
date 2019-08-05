public class TesteBanco{
    public static void main(String[] args) {
        Cliente ClientePaulo = new Cliente();
        Conta ContaPaulo = new Conta(0001,8545);
        ClientePaulo.setNome("Paulo Silveira");
        ContaPaulo.setTitular(ClientePaulo);

        System.out.println(ContaPaulo.getTitular().getNome());
        
        
        


    }
}
