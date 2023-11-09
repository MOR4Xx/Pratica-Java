package prog2Lista1;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Declaração de um Scanner para
        int[] vetor = new int[10];//Declaração do vetor
        int i=0;//Declaração de variaveis
        for (i=0; i<vetor.length; i++){//Laçõ que percorre o vetor para o preencher
            System.out.print("Digite um número: ");// pede ao usuario que insira os valores da sequencia
            vetor[i]= sc.nextInt();//faz a leitura dos dados inseridos pelo usuario
            int j=i;//iguala as variaveis I e J sendo j uma variavel auxiliar
            while (j>0 && vetor[j-1]>vetor[j]){// laço que para organizar os valores a medida que são inseridos
                int temp = vetor[j]; // armazena um valor temporario no vetor
                vetor[j]= vetor[j-1];//movimenta o valor a esquerda do vetor
                vetor[j-1]= temp;// Substitui o valor à esquerda pelo valor temporário
                j--;// Decrementa J
            }
        }
        for ( i=0; i< vetor.length; i++){//Laço para imprimir o vetor
            System.out.print(" "+vetor[i]);//imprime o valor da casa I do vetor a cada volta do laço
        }
        sc.close();//Fechamento do Scanner
    }
}
