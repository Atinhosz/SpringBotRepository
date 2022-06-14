package br.com.zup.exercicioFabricaDeCarro;

public class TestarCarro {
    public static void main(String [] args){
          Carro meuCarro;
          meuCarro = new Carro();
          meuCarro.cor = "Verde";
          meuCarro.modelo = "fusca";
          meuCarro.velocidadeAtual = 0;
          meuCarro.velocidadeMaxima = 80;

          meuCarro.liga();


          meuCarro.acelera(20);
          System.out.println(meuCarro.velocidadeAtual);








    }
}
