import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado=new Scanner (System.in);

        int X;
        double Y, kml;

        //ENTRADA
        X=teclado.nextInt();
        Y=teclado.nextDouble();

        //PROCESSAMENTO
        kml=X/Y;

        //SAIDA
        System.out.printf("%.3f km/l\n", kml);
    

    }
}