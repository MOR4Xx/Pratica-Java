import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano que deseja saber se é bissexto: ");
        int ano = sc.nextInt();
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("O ano inserido é um ano bissexto.");
        } else {
            System.out.println("O ano inserido não é um ano bissexto.");
        }

        sc.close();
    }
}
