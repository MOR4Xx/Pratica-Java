package Prog2Lista1;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vet1 [] = new int [3];
        int i;
        for(i=0 ; i<3; i++){
            System.out.println("Escreva um número:");
            vet1 [i] = scanner.nextInt();
        }
        for(i=0;i<3;i++){
            if(vet1[i]<0){
                vet1[i]=0;
                System.out.println(vet1[i]);
            }
            else{
                System.out.println(vet1[i]);
            }
        }
    }
}
