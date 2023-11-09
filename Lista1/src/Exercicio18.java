import java.util.*;

public class Exercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] num = new double[50];
        double menor=1000000000, maior=0, quantmenor=0, quantmaior=0;
        System.out.println("se quiser parar digite 0.");
        while (true){
            for(int i=0; i<50; i++) {
                System.out.print("Digite um numero: ");
                num[i] = sc.nextDouble();

                if (num[i]<0) quantmenor++;
                if (num[i]>0) quantmaior++;
                if(num[i]<menor){
                    menor=num[i];
                }
                if (num[i]>maior){
                    maior=num[i];
                }
                if (num[i]==0){
                    break;
                }
                if(i==49){
                    i=0;
                }
            }
        }
    }
}
