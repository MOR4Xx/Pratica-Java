package lista6;


import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura do comodo:");
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura do como:");
        double altura = scanner.nextDouble();
        System.out.println("Digite o comprimento do comodo:");
        double comprimento = scanner.nextDouble();
        scanner.close();
        double area1 = (comprimento * altura) * 2;
        double area2 = (largura * altura) * 2;
        double areatotal = (area1 + area2);
        double quantcaixas = (areatotal) / 1.5;
        System.out.println("Serão necessarias " + (quantcaixas) + "caixas de azuleijos.");
    }
}
