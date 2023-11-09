package prog2Lista1;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Declaração de um Scanner
        int[][] matriz1 = new int[3][3];//Declaração da matriz 1
        int[][] matriz2 = new int[3][3];//Declaração da matriz
        int[][] soma = new int[3][3];//Declaração da matriz soma para armazenar o resultado
        int i, j;
        for (i = 0; i < 3; i++) {//laço para percorrer as colunas da matriz
            for (j = 0; j < 3; j++) {//laço para percorrer as linhas da matriz
                System.out.println("Digite um numero");//pede ao usuario o valor a ser gravado na posição atual dos laços
                matriz1[i][j] = scanner.nextInt();//faz a leitura dos dados inseridos pelo usuario
            }
        }
        System.out.println("segunda matriz:");//informa ao usuario que a partir de agora sera preenchida a segunta matriz
        for (i = 0; i < 3; i++) {//laço para percorrer as colunas da matriz
            for (j = 0; j < 3; j++) {//laço para percorrer as linhas da matriz
                System.out.println("Digite um numero");//pede ao usuario o valor a ser gravado na posição atual dos laços
                matriz2[i][j] = scanner.nextInt();//faz a leitura dos dados inseridos pelo usuario
            }
        }
        for (i = 0; i < 3; i++) {//laço para percorrer as colunas da matriz
            for (j = 0; j < 3; j++) {//laço para percorrer as linhas da matriz
                soma[i][j] = matriz1[i][j] + matriz2[i][j];// Faz a soma dos elementos contidos nas posições (I,J) das matrizes
            }

        }
        for (i = 0; i < 3; i++) {//laço para percorrer as colunas da matriz
            System.out.println("\n"); // imprime um espaço entre os elementos
            for (j = 0; j < 3; j++) {//laço para percorrer as linhas da matriz
                System.out.printf("%3d",soma[i][j]);//imprime os elementos contidos nas posições (I,J) das matrizes
                
            }
        }
    }
}
