import java.util.Scanner;

public class Exercicio24a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        System.out.print("Digite um número para x: ");
        int x = sc.nextInt();
        System.out.print("Digite um número para y: ");
        int y = sc.nextInt();

        for (int i=0; x<y; i++) {
            if (i%3!=0) {
                soma = soma+i;
            }
        }
        System.out.println("A soma dos números entre x e y que não são múltiplos de 13 é: " + soma);

        sc.close();
    }
}