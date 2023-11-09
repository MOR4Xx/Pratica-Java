import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        double x, soma = 0;

        System.out.print("Digite o valor de i: ");
        i = sc.nextInt();

        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();

        for (int n = 0; n <= i; n++) {
            soma = soma + Math.pow(x, n) / !n;
        }

        System.out.println("A soma é: " + soma);

        sc.close();
    }
}