import java.util.Scanner;
public class Uri1019{
    public static void main (String args[]){
        Scanner teclado=new Scanner(System.in);

        int N, h,m,s, resto;
        
        //ENTRADA
        N=teclado.nextInt();

        //PROCESSAMENTO
        h=N/ 3600; //aqui eu pego o quociente da divisão
        resto=N% 3600; //aqui pego o resto
        
        m=resto/60;
        s=resto%60;

        //SAIDA
        System.out.println(h+":"+m+":"+s);

    }
}