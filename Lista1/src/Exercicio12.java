import java.util.Scanner;

public class Exercicio12{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, digA, digB;
        boolean encaixa= true;

        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();

        while(a>0 && b>0 && encaixa==true){
            digA = a%10;
            a = a/10;
            digB = b%10;
            b = b/10;
            if (digA!=digB){
                encaixa= false;
            }
        }
        if (encaixa==true && a>=b){
            System.out.println("Encaixa");
        }else {
            System.out.println("Não Encaixa");
        }

        sc.close();
    }
}
