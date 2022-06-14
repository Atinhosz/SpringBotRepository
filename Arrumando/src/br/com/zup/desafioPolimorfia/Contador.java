package br.com.zup.desafioPolimorfia;

public class Contador extends Ingresso{

    public Contador(String nomeDoComprador, int numeroReservado) {
        super(nomeDoComprador, numeroReservado);

    }

    public static int getIngressosVendidos(){return Contador.ingressosVendidos;}


}
