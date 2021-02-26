import java.util.Scanner;

public class Uri1003{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);

        int A, B, SOMA;

        //ENTRADA
        A=teclado.nextInt();
        B=teclado.nextInt();

        //PROCESSAMENTO
        SOMA=A+B;

        //SAIDA
        System.out.println("SOMA= "+SOMA);
    }
}