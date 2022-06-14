public class Main {

    public static void main(String[]Args){
        ContaCorrente[] c = new ContaCorrente[2];


        c[0] = new ContaCorrente("teste01","x");

    ContaCorrente contaN = new ContaCorrente("teste","x");
    ContaCorrenteEspecial contaE = new ContaCorrenteEspecial("teste0","x0");

            c[0].deposita(200);

    contaN.deposita(200);
    contaE.deposita(200);
    System.out.println(contaN.saldo);
    System.out.println(contaE.saldo);
    contaN.saca(100);
    contaE.saca(100);
    System.out.println(contaN.saldo);
    System.out.println(contaE.saldo);




    }
}
