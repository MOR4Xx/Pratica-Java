import java.util.Scanner;

public class Exercicio24b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x;
        System.out.print("Digite um número para N: ");
        N = sc.nextInt();

        for (int i=0; i<10000; i++) {
            if (N%i==2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
