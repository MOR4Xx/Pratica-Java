package prog2Lista1;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Declaração do Scanner para fazer a leitura dos dados inseridos pelo usuario
        int v1[] = new int[10];// Declaração do vetor
        int i;// declaração de variaveis
        for (i = 0; i < 10; i++) {// laço de repetição para preencher o vetor
            System.out.println("Digite um valor:");// Pede ao usuario que insira os valores para preenchimento do vetor a cada volta do laço
            v1[i] = scanner.nextInt();// Faz a leitura dos dados inseridos pelo usuario
        }
        for (i = 0; i < 10; i++) {// laço de repetição para percorre o vetor, ele fica parado ate que o laço contido dentro dele termine a sua volta
            for (int k = i + 1; k < 10; k++)// laço para comparar todos os valores do vetor com o valor contido na posição i do vetor
                if (v1[i] == v1[k]) {// verifica se o vetor na posição k e igual ao da posição i
                    System.out.println("o valor " + v1[i] + " e Repetido"); // caso positivo o imprime
                    break;// caso positivo para o laço de dentro para que o de fora pule para o proximo
                          // valor
                }
        }
        scanner.close();
    }
}
