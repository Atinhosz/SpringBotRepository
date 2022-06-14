package br.com.zup.desafioPolimorfia;

public class CamaroteSupuerior extends Vip {

    public CamaroteSupuerior(String nomeDoComprador, int numeroReservado) {
        super(nomeDoComprador, numeroReservado);
    }


    public static String localizaçãoSuperior(){return "Subindo as escadas a direita na entrada";}

}
