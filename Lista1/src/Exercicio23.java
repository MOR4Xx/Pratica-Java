import java.util.*;

public class Exercicio23 {
    public static void main(String[] args){
        Random all = new Random();
        double m=0, media=0, sig=0, p=0;
        int[] vetor= new int[10];
        for(int i=0; i<10; i++){
            vetor[i]=all.nextInt(100);
        }
        for(int j=0; j<10; j++){
            m= m+vetor[j];
        }
        media =m/10;
        for(int k=0; k<10; k++){
            p = p + (vetor[k] - media);
        }
        sig= Math.sqrt((p*1)/10);

        System.out.println("Desvio ="+sig);
    }
}
