public class BankTest{
    public static void main(String[] args) {
        Client ClientePaulo = new Client();
        CheckingAccount ContaPaulo = new CheckingAccount(0001,8545);
        ClientePaulo.setName("Paulo Silveira");
        ContaPaulo.setHolder(ClientePaulo);

        System.out.println(ContaPaulo.getHolder().getName());
        
        
        


    }
}
