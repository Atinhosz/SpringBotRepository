public abstract class Conta {

    protected String titular;
    protected int agencia;
    protected int cpf;
    protected double saldo;
    protected double divida;
    public double limite;
    public double juros;

     /*
    TIPOS DE CONTAS
    Correntes (Conta que te da livre movimento)
    Poupança (Conta para guardar dinheiro para rendimentos)
    Juridica (Conta de "pessoa juridica")
    Salario (Conta aonde a empresa deposita mensalmente)
    Debito (você coloca dinheiro dentro da conta para poder gastar apenas oque tem la dentro)
    Credito (Você ganha um limite que vc pode gastar alem do que você tem)
     */


    public Conta(String titular, int agencia, int cpf,double limite) {
    }

    public String getTitular() {
        return this.titular;
    }

    public abstract boolean saca(double quantia);

    public abstract double deposita(double valor);

    public abstract void mudaLimite(double novoLimite);

}