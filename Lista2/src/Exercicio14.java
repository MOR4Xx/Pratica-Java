import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite o valor para decompor:");
        int val= sc.nextInt();

        int n1 = 0, n2, n5, n10, n20, n50, n100;

        n100= val/100;
        val= val%100;
        n50= val/50;
        val= val%50;
        n20= val/20;
        val= val%20;
        n10= val/10;
        val= val%10;
        n5= val/5;
        val= val%5;
        n2= val/2;
        val= val%2;

        System.out.printf("O valor decom posto vai precisar de: \n %d notas de 100",n100);
        System.out.printf("\n %d notas de 50",n50);
        System.out.printf("\n %d notas de 20",n20);
        System.out.printf("\n %d notas de 10",n10);
        System.out.printf("\n %d notas de 5",n5);
        System.out.printf("\n %d notas de 2",n2);
        System.out.printf("\n %d notas de 1",val);
        sc.close();
    }
}
