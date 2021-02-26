//Seis numeros impares

import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X,cont;
        X= teclado.nextInt();
       
        for (cont =X; cont >= 6; cont++){
            
            if (X % 2 !=0){
                cont=cont+1;
            }
        }
        System.out.println(cont);
    }
}