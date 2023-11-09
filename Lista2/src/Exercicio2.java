import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva a idade do atleta: ");
        int idade = sc.nextInt();
        if (idade >= 5 && idade <= 7) {
            System.out.println("A categoria do atleta é a categoria Infantil A");
        } else if (idade >= 8 && idade <= 11) {
            System.out.println("A categoria do atleta é a categoria Infantil B");
        } else if (idade >= 12 && idade <= 13) {
            System.out.println("A categoria do atleta é a categoria Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("A categoria do atleta é a categoria Juvenil B");
        } else if (idade >= 18) {
            System.out.println("A categoria do atleta é a categoria Adulto");
        }

        sc.close();
    }
}
