//numeros positivos

import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

    float N;
    int qtd=0; //preciso ter um valor inicial, pq senão depois eu não consigo somar +1

    for (int cont = 1; cont <=6; cont++){ //aqui neste cabeçalho eu estou contando até 6
        //tudo o que acontecer aqui vai acontecer 6 vezes
        N =  teclado.nextFloat();
        if (N > 0){
            qtd = qtd + 1;
        }
       
    }
    System.out.println(qtd + " valores positivos");
    }
}