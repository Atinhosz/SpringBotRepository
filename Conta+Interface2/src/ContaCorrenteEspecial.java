public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String titular, String agencia) {
        super(titular, agencia);
    }
    private double taxa = 0.01;




    @Override
    public void saca(double valor) {this.saldo =saldo - (valor % taxa + valor);
    }




}
