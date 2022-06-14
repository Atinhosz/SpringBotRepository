package br.com.zup.desafioPolimorfia;

import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

   // Contador contador = new Contador("x",00);


        //Teste
        ArrayList<Ingresso> listaDeIngressados = new ArrayList<>();
        listaDeIngressados.add(new Ingresso("jonas",35));
        listaDeIngressados.add(new Ingresso("aoba",34));

    //Criação de Objetos...
    Ingresso jonas = new Ingresso("Alexandro",01);
    Ingresso joana = new Ingresso("alberto",02);
    Ingresso lord = new Vip("MyLord",03);
    CamaroteInferior localizaçãoInferior = new CamaroteInferior("x",00);
    CamaroteSupuerior localizaçãoSuperior = new CamaroteSupuerior("x",00);
    Ingresso abelha = new Ingresso("Russia",04);
    Ingresso local1 = new CamaroteInferior("Cadeira para tontos",983);
    Ingresso oCaraRico = new Vip("Eduard",8922);

    for(Ingresso ingresso: listaDeIngressados){System.out.println(ingresso.numeroReservado); }




    //Testes...
     System.out.println("valor em reais normal " + jonas.imprimeValor());
     System.out.println("valor em reais Vip " +  lord.imprimeValor());
     System.out.println("localização " + localizaçãoInferior.localizaçãoInferior());
     System.out.println("localização " + localizaçãoSuperior.localizaçãoSuperior());
     System.out.println(Contador.getIngressosVendidos());



    }
}
