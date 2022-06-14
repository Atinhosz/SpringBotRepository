public class ContaCorrente implements MetadosDeTransferencia {
    double saldo = 00;
    private double taxa =0.05;


         public ContaCorrente(String titular,String agencia){
         }

    @Override
    public void deposita(double valor) {this.saldo = saldo + valor;
    }

    @Override
    public void saca(double valor) {this.saldo =saldo - (valor % taxa + valor);
    }
}
