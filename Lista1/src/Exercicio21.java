import java.util.Random;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random all = new Random();
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[10];
        for (int i=0; i<10; i++){
            v1[i] = all.nextInt(100);
        }
        for (int j=0; j<10; j++){
            v2[j] = all.nextInt(100);
        }
        for (int k=0; k<10; k++){
            if ((k+1)%2==0){
                v3[k]= v1[k];
            }else {
                v3[k]= v2[k];
            }
        }
        System.out.println("Vetor 1");
        for (int m=0; m<10; m++){
            System.out.print(" "+v1[m]);
        }
        System.out.println(" ");
        System.out.println("Vetor 2");
        for (int n=0; n<10; n++){
            System.out.print(" "+v2[n]);
        }
        System.out.println(" ");
        System.out.println("Vetor 3");
        for (int l=0; l<10; l++){
            System.out.print(" "+v3[l]);
        }

        sc.close();
    }
}
