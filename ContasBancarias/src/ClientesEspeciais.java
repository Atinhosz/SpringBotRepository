public class ClientesEspeciais extends ContaCorrente{

    private double taxa = 0.01;
    public ClientesEspeciais(String titular, String agenceia) {
        super(titular, agenceia);
    }

    void sacaEspecial(double valor){

        this.saldo = saldo - (valor % taxa + valor);
    }

}
