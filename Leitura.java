//primeira coisa importar a Biblioteca (componente) de leitura de dados
import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        //criar esse componente, informando que ele irá ler do teclado
        Scanner teclado;
        teclado=new Scanner(System.in);

        int a;
        double b;

        System.out.println("Digite o valor inteiro");
        a=teclado.nextInt();
        System.out.println("Você digitou="+a);

        System.out.println("Digite o valor real");
        b=teclado.nextDouble();
        System.out.println("Você digitou ="+b);

    }



}