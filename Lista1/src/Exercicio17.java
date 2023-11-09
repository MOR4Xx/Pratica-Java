import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        for (int i=0; i<10; i++){
            System.out.print("Digite um valora para o vetor 1: ");
            A[i] = sc.nextInt();
            System.out.print("Digite um valora para o vetor 2: ");
            B[i] = sc.nextInt();
        }
        for (int j=0; j<10; j++){
            C[j] = A[j]-B[j];
            System.out.print(" "+C[j]);
        }
    }
}
