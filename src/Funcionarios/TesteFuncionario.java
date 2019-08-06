package Funcionarios;

public class TesteFuncionario{
    public static void main(String[] args) {
        Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("223463645-28");
        nico.setSalario(5000.0);
        
        Designer paulo = new Designer();
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("5482186757-5");
        paulo.setSalario(2400.0);
        
        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

        System.out.println(paulo.getNome());
        System.out.println(paulo.getBonificacao());
        
    }
}