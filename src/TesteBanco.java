public class TesteBanco{
    public static void main(String[] args) {
        Cliente ClientePaulo = new Cliente();
        ContaCorrente ContaPaulo = new ContaCorrente(0001,8545);
        ClientePaulo.setNome("Paulo Silveira");
        ContaPaulo.setTitular(ClientePaulo);

        System.out.println(ContaPaulo.getTitular().getNome());
        
        
        


    }
}
