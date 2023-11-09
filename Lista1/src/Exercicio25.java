import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int i=0;
        for (i=0; i<vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i]= sc.nextInt();
        }
        int j=10;
        while (vetor[j - 1] > vetor[j]){
            int temp = vetor[j];
            vetor[j]= vetor[j-1];
            vetor[j-1]= temp;
            j--;
        }
        for (int k=0; k< vetor.length; k++){
            System.out.print(" "+vetor[k]);
        }
        sc.close();
    }
}
