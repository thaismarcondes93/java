import java.util.Scanner;
public class Uri2780{
    public static void main(String args[]){
        Scanner teclado= new Scanner(System.in);

        int D, ponto;

        //ENTRADA
        D = teclado.nextInt();

        //PROCESSAMENTO
        if (D <= 800){
            ponto=1;

            System.out.println(ponto);
        }
        else if (800 < D && D <= 1400){
            ponto=2;

            System.out.println(ponto);
        }
        else if (1400 < D && D <=2000){
            ponto=3;

            System.out.println(ponto);
        }
    }

}