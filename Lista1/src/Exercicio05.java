package lista6;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int menu = 0;
        Scanner scanner = new Scanner(System.in);
        while (menu != 5) {
            System.out.println("Escolha uma opcão: 1:Cadastrar 2:Listar 3:Atualizar 4:Excluir 5:Sair.");
            menu = scanner.nextInt();
            if (menu == 1) {
                System.out.println("Opcão 1 escolida. fase de construção.");
            }
            if (menu == 2) {
                System.out.println("Opcão 2 escolida. fase de construção.");
            }
            if (menu == 3) {
                System.out.println("Opcão 3 escolida. fase de construção.");
            }
            if (menu == 4) {
                System.out.println("Opcão 4 escolida. fase de construção.");
            }
            if (menu > 5) {
                System.out.println("Esxolha uma opção válida.");
            }
        }
        System.out.println("Vocé saiu");
        scanner.close();
    }
}
