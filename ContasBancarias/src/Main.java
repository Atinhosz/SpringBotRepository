public class Main {



    public static void main(String[]args){


        ContaCorrente C1 = new ContaCorrente("x","x");
        ClientesEspeciais C2 = new ClientesEspeciais("x","x");

        C1.deposita(200);
        C1.saca(100);
        System.out.println(C1.saldo);

        C2.deposita(200);
        C2.sacaEspecial(100);
        System.out.println((C2.saldo));





    }
}
