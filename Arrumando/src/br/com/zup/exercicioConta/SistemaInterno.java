package br.com.zup.exercicioConta;

import java.util.Scanner;

public class SistemaInterno {

   Scanner digitar = new Scanner(System.in);

    public void login(Autenticavel a){
        int verificando = digitar.nextInt();
       boolean ok = a.autentica(verificando);




    }
}
