//Pares, impares, Positivos e Negativos

import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, cont, qpar =0, qimpar=0, qposi=0, qneg=0; 
    

        for (cont = 1; cont <=5; cont++){
            N= teclado.nextInt();
            if (N % 2 ==0){
                qpar = qpar +1;
            }
            else if (N % 2 !=0){
                qimpar = qimpar +1;
            }
            if (N > 0){
                qposi++;
            }
            else if (N < 0){
                qneg++;
            }

        }
        System.out.println(qpar + " valor(es) par(es)");
        System.out.println(qimpar +" valor(es) impar(es)");
        System.out.println(qposi + " valor(es) positivo(s)");
        System.out.println(qneg + " valor(es) negativo(s)");
    }
}