class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        System.out.println("Criando uma conta");
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor){
        saldo += valor; 
    }

    public boolean saca(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transfere(double valor, Conta destino){
        if(valor <= saldo){
            saldo -= valor;
            destino.deposita(valor);
            return true;
        } 
        return false;
    }
    public double getSaldo(){
        return saldo; 
    }

  
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
   
    public int getNumero() {
        return numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    public static int getTotal(){
        return Conta.total;
    }
}