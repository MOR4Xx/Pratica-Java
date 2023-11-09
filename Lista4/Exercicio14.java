package lista2Prog2;

import java.util.Scanner;

public class Esercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Digite o tamanho da colmeia: ");
        n = scanner.nextInt();

        if(n==1){
            System.out.println("Dayllon precisazará preencher 1 alvéolo.");
        }
        else{
            
            System.out.println("Dayllon precisazará preencher "+(3*(n-1))+" alvéolo.");
        }
        scanner.close();
    }
}
