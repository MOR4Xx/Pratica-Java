import java.util.Random;

public class Exercicio20 {
    public static void main(String[] args){
        Random all = new Random();
        long[] num = new long[10];
        long maior=0, menor=1000000000, p1=0, p2=0;
        for (int i=0; i<10; i++){
            num[i]= all.nextLong(1000);
            if (num[i]<menor){
                menor= num[i];
                p1=i+1;
            }
            if (num[i]>maior){
                maior= num[i];
                p2=i+1;
            }
        }

        for (int j=0; j<10; j++){
            System.out.print(" "+num[j]);
        }
        System.out.printf("\nO maior numero foi %d", maior);
        System.out.printf("\nE a posição do maior número foi %d", p2);
        System.out.printf("\nO menor numero foi %d", menor);
        System.out.printf("\nE a posição do maior número foi %d", p1);
    }
}
