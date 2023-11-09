package lista6;

import java.util.Scanner; //Importa o pacote Scanner

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um scanner para receber os valores digitados pelo usuario
        int v1[] = new int[10]; //Cria um vetor inteiro com tamanho 10 para armazenar o primeiro vetor
        int v2[] = new int[10]; //Cria um vetor inteiro com tamanho 10 para armazenar o segundo vetor
        int v3[] = new int[10]; //Cria um vetor inteiro com tamanho 10 para armazenar o resultado da subtração

        System.out.println("Vetor 1"); //Imprime informações para o usuario
        for (int i=0; i<10; i++){ // for usado para preencher o vetor 1
            System.out.print("\nDigite o elemento da posição "+(i+1)+" : "); // Imprime instruções para o usuario
            v1[i] = sc.nextInt();// Armazena o valor digitado pelo usuario no vetor 1
        }

        System.out.println("\nVetor 2"); //Imprime informações para o usuario
        for (int i=0; i<10; i++){ // for usado para preencher o vetor 2 e ja fazer a subtração dos vetores
            System.out.print("\nDigite o elemento da posição "+(i+1)+" : "); // Imprime instruções para o usuario
            v2[i] = sc.nextInt();// Armazena o valor digitado pelo usuario no vetor 2
            v3[i] = v1[i]-v2[i];// Faz a subtração dos vetores 1 e 2 na posição i
        }

        for (int i=0; i<10; i++) { // for usado para imprimir o resultado da subtração dos vetores
            System.out.print(v3[i]+" "); //Print que imprime o elemento do vetor 3 na posição i
        }

        sc.close(); // Fecha o scanner
    }

}
