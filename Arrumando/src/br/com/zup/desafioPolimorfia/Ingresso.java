package br.com.zup.desafioPolimorfia;
public class Ingresso {

    protected double valorEmReais = 10;
    public static int ingressosVendidos;
    String nomeDoComprador;
    int numeroReservado;



    public Ingresso(String nomeDoComprador, int numeroReservado) {
        this.ingressosVendidos ++;
        this.nomeDoComprador = nomeDoComprador;
        this.numeroReservado = numeroReservado;
    }

    public double imprimeValor() {return this.valorEmReais;}



//public static int getIngressosVendidos(){return Ingresso.ingressosVendidos;}



}
