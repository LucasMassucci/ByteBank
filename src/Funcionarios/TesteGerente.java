package Funcionarios;

public class TesteGerente{
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("134889458-45");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        
       System.out.println(g1.autentica(22540));
       System.out.println(g1.getBonificacao());



    }
}