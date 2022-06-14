package br.com.zup.desafioPolimorfia;
public class CamaroteInferior extends Vip {


    public CamaroteInferior(String nomeDoComprador, int numeroReservado) {
        super(nomeDoComprador, numeroReservado);
    }


   public static String localizaçãoInferior(){return "descendo as escadas a direita na entrada";}

}
