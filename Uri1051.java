import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario, pagamentoIR;
        int percentual;

        //entrada
        salario = teclado.nextFloat();

        if (salario <=2000.00f){
            percentual = 0;
        }
        else if (salario <= 3000.00f){
            percentual = 8;
        }
        else if (salario <=4500.00f){
            percentual = 18;
        }
        else if => 4501.00f){
            percentual = 28
        }
    }
}