package prog2Lista1;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] multiplicacão = new int[3][3];
        int i, j, k;
        for (i = 0; i < 3; i++) {//laço para percorrer as linhas da matriz
            for (j = 0; j < 3; j++) {//laço para percorrer as colunas da matriz
                System.out.println("Digite um numero");//pede ao usuario o valor a ser gravado na posição atual dos laços
                matriz1[i][j] = scanner.nextInt();//faz a leitura dos dados inseridos pelo usuario
            }
        }
        System.out.println("segunda matriz:");//informa ao usuario que a partir de agora sera preenchida a segunta matriz
        for (i = 0; i < 3; i++) {//laço para percorrer as linhas da matriz
            for (j = 0; j < 3; j++) {//laço para percorrer as colunas da matriz
                System.out.println("Digite um numero");//pede ao usuario o valor a ser gravado na posição atual dos laços
                matriz2[i][j] = scanner.nextInt();//faz a leitura dos dados inseridos pelo usuario
            }
        }
        for (i = 0; i < 3; i++) {//laço para percorrer as linhas da matriz
            for (j = 0; j < 3; j++) {//laço para percorrer as colunas da matriz
                for (k = 0; k < 3; k++) {//laço para percorrer os elementos a serem multiplicados
                    multiplicacão[i][j] += matriz1[i][k] * matriz2[k][j]; // faz a multiplicação dos elementos das metrizes
                }
            }

        }
        for(i=0;i<3;i++){//laço para percorrer as linhas da matriz
            System.out.println("\n");// imprime um espaço entre os elementos
            for(j=0;j<3;j++){//laço para percorrer as colunas da matriz
                System.out.printf("%3d",multiplicacão[i][j]);//imprime os elementos contidos nas posições (I,J) da matriz multiplicação
            }
        }

    }
}
