import java.util.Arrays;

public class Fé {


    public static void main(String []args){

        int[] armazem = new int[5];
        int cArray = 0;
        int soma = 0;

        for(int i = 1; i <= 10 ; i++) {
            if(i%3 == 0 || i%5 == 0){
                armazem[cArray] = i;
                cArray ++;

            }
        }

        for(int i = 0; i < 5; i++){
            if(i%2 == 0){

                soma = armazem[i] + soma;


            }

        }
        System.out.println(soma);

    }

}
