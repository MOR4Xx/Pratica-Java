package lista6;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[15];
        int pos, num = 0, i = 0;
        for (i = 0; i < 15; i++) {
            System.out.println("Digite um valor: ");
            v1[i] = scanner.nextInt();
            if(i==15){
                scanner.close();
            }

        }
        System.out.println("Antes da compactação: ");
        for (i = 0; i < 15; i++) {
            System.out.print(v1[i]);
        }
        for (i = 1; i < v1.length; i++) {
            if (v1[i] == 0 || v1[i] == 00 || v1[i] == 000) {
                for (pos = i; pos < v1.length; pos++) {
                    if (v1[pos] != 0 || v1[pos] != 00 || v1[pos] != 000) {
                        num = v1[pos];
                        v1[i] = num;
                        v1[pos] = 0;
                        break;
                    }
                }
            }
        }

        System.out.println("\nApos a compactação:");
        for (i = 0; i < 15; i++) {
            System.out.print(v1[i]);

        }
        

    }

}
