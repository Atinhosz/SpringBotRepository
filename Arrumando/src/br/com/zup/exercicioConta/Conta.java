package br.com.zup.exercicioConta;

public class Conta {



   protected String titular;
    int numero;
    double saldo;
   private double limite = 150;
   private static int totalDeContas;



   public Conta (int numero, String titular){
        this.titular = titular;
        this.numero = numero;
       this.totalDeContas = this.totalDeContas +1;

   }


    public static int getTotalDeContas(){
       return Conta.totalDeContas;
    }





    Data dataDeAbertura;

    String recuperarDadosParaImpressão(){
        String dados = "/nTitular" + this.titular;

        dados += "\nDia: " + this.dataDeAbertura.dia;
        dados += "\nMês: " + this.dataDeAbertura.mes;
        dados += "\nAno: " + this.dataDeAbertura.ano;
        return dados;
    }




    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public double setSaldo(double saldo){
        this.saldo = saldo;
        return saldo;
    }

    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    //DEPOSITAR
    void deposita(double quantidade){ this.saldo += quantidade;}




    //SACAR
    public void saca(double valor) {
        //posso sacar até saldo
        if (valor > this.saldo){
            System.out.println("Não posso sacar um valor maior do que o saldo!");
        } else {
            this.saldo = this.saldo - valor;
        }
    }



}



