import java.util.Scanner;
public class Exercicio2E{
    public static void main (String args[]){

        Scanner teclado;
        teclado=new Scanner (System.in);

        int a,b,c,d;

        System.out.println("Digite a base maior do trapezio");
        a=teclado.nextInt();

        System.out.println("Digite a base menor do trapezio");
        b=teclado.nextInt();

        System.out.println("Digite a altura do trapezio");
        c=teclado.nextInt();

        d=(a+b)*c/2;

        System.out.println("A area do trapezio ="+d);

    }

}