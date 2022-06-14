package br.com.zup.exercicioConta;

public class ContaTeste {


    public static void main(String [] args){
        Data data = new Data();

       /* //cliente

        //conta
        //C1.setTitular("alex");
        //C1.= "Agua";
        //C1.Titular.agencia = "Itau";
        //C1.deposita(100);
        //C1.saca(50);

       // System.out.println(C1.getSaldo());

        //datas (com problemas)
        //C1.dataDeAbertura.dia = 25;
        //C1.dataDeAbertura.mes = 02;
        //C1.dataDeAbertura.ano = 2022;

        Funcionario alberto = new Funcionario("alberto","jão");

        alberto.setCpfFuncionario("000000000");

        System.out.println(alberto.getCpfFuncionario());

        Conta teste = new Conta(1,"Alexandro");
        teste.numero = 1;
        teste.saldo = 1340;

       // Conta c = new Conta(2,"alemanhã");*/



        //Criando objetos
        Funcionario funcionario = new Funcionario("Alisson","00000000-",2000,123);
        Gerente gerente = new Gerente("Ricardo","000000000000", 5000,123);
        Diretor diretor = new Diretor("Limão","00000000000",10000,123);
        Autenticavel a = new Gerente("a","00",00,123);
        Autenticavel b = new Diretor("b","00",00,123);




        //System.out.println(gerente.getBonificacao());

       //System.out.println(gerente.getNome());

       // Conta C1 = new Conta(2,"willian");
       // C1.setSaldo(100);
        //C1.deposita(200);

            int total = Conta.getTotalDeContas();
        //System.out.println(total);
        gerente.autenticaSenha(123);







        System.out.println("Coisas a terminar nesse aqui ainda, voltar ao capitolo 4 depois");



    }
}
