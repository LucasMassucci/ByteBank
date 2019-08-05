public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private double renda;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getRenda() {
        return renda;
    }
}
