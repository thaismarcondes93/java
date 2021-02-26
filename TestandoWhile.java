import java.util.Scanner;
public class TestandoWhile{
    public static void main(String args[]){
        
        int num = 5;
        int contador;

        contador = 1;
        while (contador <= 10){
            System.out.println(num + "x"+ contador + "=" + (num * contador));
            contador = contador +1;
        }
    }
}    