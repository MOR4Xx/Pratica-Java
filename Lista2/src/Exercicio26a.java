import java.util.Scanner;

public class Exercicio26a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i, n, x, soma = 0;
        System.out.print("Digite o valor de n: ");
        n = sc.nextDouble();
        System.out.print("Digite o valor de i: ");
        i = sc.nextDouble();
        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();

        for (i = 0; i <= n; i++) {
            soma = soma + (n - i) / Math.pow(x, i);
        }
        System.out.println("A soma é: " + soma);

        sc.close();
    }
}
