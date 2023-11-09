import java.util.Scanner;
public class Exercicio25 {
    private static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, i = 0, num;
        int[] hexa = new int[50];
        System.out.print("Informe o número: ");
        num = sc.nextInt();
        while (num > 10) {
            hexa[i++] = num % 16;
            num = num / 16;
        }
        System.out.print("Hexadecimal: ");
        for (j = (i - 1); j >= 0; j--) {
            if (hexa[j] >= 10)
                System.out.printf("%c", hexa[j] - 10 + 'A');
            else
                System.out.printf("%d", hexa[j]);
        }
        sc.close();
    }
}
