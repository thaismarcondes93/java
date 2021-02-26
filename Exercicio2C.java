import java.util.Scanner;
public class Exercicio2C{
    public static void main (String aargs []){

        Scanner teclado;
        teclado=new Scanner (System.in);
        double a,b,c;

        System.out.println("Digite a base do triangulo");
        a=teclado.nextDouble();

        System.out.println("Digite a altura do triangulo");
        b=teclado.nextDouble();

        c=a*b/2;
        //Codigo abaixo usado para para exibir 3 casas decimais, somente valido para printf (formatar a saida)
        System.out.printf("A area do triangulo: %.3f\n",+c);


    }


}