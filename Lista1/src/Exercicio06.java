package lista6;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salario:");
        double sal = scanner.nextDouble();
        System.out.println("Digite a sua gratificação:");
        double gratif = scanner.nextDouble();
        scanner.close();
        double salbruto = (sal + gratif);
        double ir;
        double salliq;
        if (salbruto < 1000) {
            ir = ((salbruto) * (0.15));
            salliq = (salbruto - ir);
            System.out.println("O seu salário liquido é" + salliq);
        } else {
            ir = ((salbruto) * (0.20));
            salliq = (salbruto - ir);
            System.out.println("O seu salário liquido é" + salliq);
        }

    }
}
