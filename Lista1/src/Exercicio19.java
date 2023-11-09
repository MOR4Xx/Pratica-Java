import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int quant=0;

        System.out.println("Digite 10 números:");
        for (int i=0; i<10; i++) {
            num[i] = sc.nextInt(100);
        }
        System.out.print("Digite um número x: ");
        int x = sc.nextInt();
        for (int j=0; j<10; j++){
            if(num[j]%x==0){
                quant++;
            }
        }
        System.out.println("Quantidade de multiplos de "+x+" é "+quant);
    }
}
