import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);

        int temp,vel;
        double lit;

        //entrada
        temp= teclado.nextInt();
        vel= teclado.nextInt();

        //processamento
        lit=temp*vel/12.0;

        //saida
        System.out.printf("%.3f\n", lit);


    }
}