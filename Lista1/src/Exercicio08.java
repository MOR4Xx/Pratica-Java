package lista6;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase;");
        String frase = scanner.nextLine();
        String frasem = frase.toUpperCase();
        System.out.println(frasem);
        scanner.close();
    }
}
