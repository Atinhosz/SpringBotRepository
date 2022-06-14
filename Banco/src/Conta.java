public class Conta {
    int numero;
    double saldo;
    Cliente titular = new Cliente();


    // Primeiro metado que usei

   /* void saca(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }  */
    void deposita(double quantidade){
        this.saldo += quantidade;
    }


    boolean saca(double valor){
        if(this.saldo < valor){
            System.out.println("Você não tem essa quatia para sacar");
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            System.out.println("você sacou :" + valor);
            return true;
        }
    }

    boolean transferepara(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            System.out.println("Sua tranferencia não ocorreu com sucesso. :(");
            return false;
        } else {
            destino.deposita(valor);
            return true;
        }

    }



}
