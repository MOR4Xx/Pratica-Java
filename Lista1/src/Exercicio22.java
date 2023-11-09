package lista6;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] c1 = new int[5];
        int[] c2 = new int[5];
        int i = 0;
        double produto = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("Digite um valor; ");
            c1[i] = leia.nextInt();
            if (i == 5) {
                leia.close();
            }

        }
        System.out.println("Segundo vetor:");
        for (i = 0; i < 5; i++) {
            System.out.println("Digite um valor; ");
            c2[i] = leia.nextInt();

        }

        for (i = 0; i < 5; i++) {
            produto = produto + (c1[i] * c2[i]);

        }
        System.out.println("O produto escalar é:" + produto);

    }
}
