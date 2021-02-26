import java.util.Scanner;
public class Exercicio2A{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);

        int a,b;

        System.out.println("Digite o valor do lado do quadrado, para calcular a área");
        a=teclado.nextInt();
            b=a*a;
            System.out.println("Area do quadrado ="+b);
        
    }

}