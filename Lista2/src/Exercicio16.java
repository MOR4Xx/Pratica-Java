import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de termos:");
        int termos = sc.nextInt();
        int s=0;
        for (int i=0; i<termos; i++){
            if (i%2!=0){
                s++;
            }else{
                s--;
            }
        }
        System.out.println("A somatória dos termos é: "+s);

        sc.close();
    }
}
