import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite o valor para decompor: R$");
        double val= sc.nextDouble();

        double n2, n5, n10, n20, n50, n100, m1;
        double centavos, m50, m25, m10, m5, m01;

        val=val*100;
        centavos= val%100;

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
        m1= val;
        m50= centavos/50;
        centavos= centavos%50;
        m25= centavos/25;
        centavos= centavos%25;
        m10= centavos/10;
        centavos= centavos%10;
        m5= centavos/5;
        centavos= centavos%5;
        m01= centavos;

        System.out.printf("O valor decom posto vai precisar de: \n %d notas de 100",n100);
        System.out.printf("\n %d notas de 50",n50);
        System.out.printf("\n %d notas de 20",n20);
        System.out.printf("\n %d notas de 10",n10);
        System.out.printf("\n %d notas de 5",n5);
        System.out.printf("\n %d notas de 2",n2);
        System.out.printf("\n %d moeda de 1",m1);
        System.out.printf("\n %d moeda de 50",m50);
        System.out.printf("\n %d moeda de 1",m25);
        System.out.printf("\n %d moeda de 1",m10);
        System.out.printf("\n %d moeda de 1",m5);
        System.out.printf("\n %d moeda de 1",m01);

        sc.close();
    }
}