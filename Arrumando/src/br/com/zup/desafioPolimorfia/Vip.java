package br.com.zup.desafioPolimorfia;
public class Vip extends Ingresso{




    public Vip(String nomeDoComprador, int numeroReservado) {
        super(nomeDoComprador, numeroReservado);
    }

    @Override
    public double imprimeValor() {
        return this.valorEmReais + 25;
    }


















}
