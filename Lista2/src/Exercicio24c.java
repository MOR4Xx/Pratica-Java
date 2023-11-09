import java.util.Scanner;

public class Exercicio24c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, posicao=0, maior=0;
        for(int i=0; i<100; i++){
            System.out.println("Digite um numero para N: ");
            N = sc.nextInt();
            if (N>maior){
                posicao=i+1;
                maior=N;
            }
        }
        System.out.printf("O maior numero é %d e sua posicao foi %d", maior, posicao);

        sc.close();
    }
}