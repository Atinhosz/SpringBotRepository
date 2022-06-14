public class Credito extends Conta{


    public Credito(String titular, int agencia, int cpf,double limite) {
        super(titular, agencia, cpf,limite);
    }



    @Override
    public boolean saca(double quantia){
        if(saldo - quantia >= limite){
            saldo = this.saldo - quantia;
            return true;
        }
        System.out.println("Você tentou sacar mais do que sua quantia permite, tente novamente.");
        return false;
    }

    @Override
    public double deposita(double quantidade) {return saldo = this.saldo + quantidade;}

    @Override
    public void mudaLimite(double novoLimite) {this.limite = novoLimite;}






}
