import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float x,y;

        //entrada
        x=teclado.nextFloat();
        y=teclado.nextFloat();

        //processamento
        if (x> 0 && y >0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0){
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        else if (x == 0 && y != 0){
            System.out.println("Eixo Y");
        }
        else if (x != 0 && y == 0){
            System.out.println("Eixo X");
        }
        else{
            System.out.println("Origem");
        }   

    }
}