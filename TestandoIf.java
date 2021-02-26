import java.util.Scanner;
public class TestandoIf{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        double n1, n2, me;

        System.out.print("Por favor digite a nota 1: ");
        n1 = teclado.nextDouble();
        System.out.print("Agora digite a nota 2: ");
        n2 = teclado.nextDouble();

        me = (n1 + n2)/2;

        System.out.printf("Sua media %.2f\n",me);

        if (me >= 6.0){
            System.out.println("Parabens voce esta aprovado!");
        }
        else{
            System.out.println("Obaa!!!Nos vemos no ano que vem");
        }
    }
}