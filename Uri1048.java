import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario, novosalario, reajuste;
        int percentual; 

        //entrada
        salario = teclado.nextFloat();

        //processamento
        if (salario <= 400.00){
            percentual = 15;
            reajuste = salario * percentual /100;
            novosalario = salario + reajuste;

            System.out.printf("Novo salario: %.2f\n", novosalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.printf("Em percentual: %d %%\n" , percentual);
        }
        else if (salario >= 400.01 && salario <= 800.00){
            percentual = 12;
            reajuste = salario * percentual / 100;
            novosalario = salario + reajuste;

            System.out.printf("Novo salario: %.2f\n" ,novosalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.printf("Em percentual: %d %%\n" , percentual);
        }
        else if (salario >=800.01 && salario <=1200.00){
            percentual = 10;
            reajuste = salario * percentual / 100;
            novosalario = salario + reajuste;

            System.out.printf("Novo salario: %.2f\n" , novosalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.printf("Em percentual: %d %%\n" , percentual);
        }
        else if (salario >=1200.01 && salario <=2000.00){
            percentual = 7;
            reajuste = salario * percentual /100;
            novosalario = salario + reajuste;

            System.out.printf("Novo salario: %.2f\n" , novosalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.printf("Em percentual: %d %%\n" , percentual);
        }
        else if (salario > 2000.00){
            percentual = 4;
            reajuste = salario * percentual /100;
            novosalario = salario + reajuste;

            System.out.printf("Novo salario: %.2f\n" , novosalario);
            System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
            System.out.printf("Em percentual: %d %%\n" , percentual);
        }
            
    }
}