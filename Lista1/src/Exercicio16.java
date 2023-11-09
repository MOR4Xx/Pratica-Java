import java.util.Random;

public class Exercicio16 {
    public static void main(String[] args){
        Random all = new Random();
        int[] v = new int[10];
        for(int i =0; i<10; i++){
            v[i]= all.nextInt();
            if(v[i]<0){
                v[i]=0;
            }
        }
        for (int j=0; j<10; j++){
            System.out.print(" "+v[j]);
        }
    }
}
