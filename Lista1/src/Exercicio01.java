package lista6;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (i != 0) {

            System.out.println("Digite o primeiro termo:");
            double x = scanner.nextDouble();
            System.out.println("Digite o Segundo termo:");
            double y = scanner.nextDouble();

            if (y == 0) {
                System.out.println("A divisão é impossivel.");

            } else {
                double divisao = x / y;
                System.out.println("A divisão é: " + divisao);
            }
        }
        scanner.close();
    }
}
