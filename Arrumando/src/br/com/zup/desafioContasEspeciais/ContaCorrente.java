package br.com.zup.desafioContasEspeciais;
public class ContaCorrente {

    double saldo = 00;
    private double taxa = 0.05;

    public ContaCorrente(String titular,String agenceia){

    }

    void deposita(double valor){
        this.saldo = saldo + valor;
    }
    void saca(double valor){
        this.saldo = saldo - (valor % taxa + valor);
    }
}
