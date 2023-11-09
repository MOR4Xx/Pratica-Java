//Realize a multiplicação de duas matrizes 3x3

import java.util.*; //importa todos os pacotes dentro do java.util

public class Exercicio27 {
    public static void main(String[] args) {
        Random all = new Random(); // Cria um randomizador de numeros para preencher as matrizes
        int[][] matriz1 = new int[3][3]; //Criação de uma matriz inteira 3x3
        int[][] matriz2 = new int[3][3]; //Criação de uma matriz inteira 3x3
        int[][] matriz3 = new int[3][3];// Criação de uma matriz inteira 3x3

        for (int i=0; i<3; i++){ // for para preencher as linhas da matriz 1 com numeros aleatorios
            for(int j=0; j<3; j++){// for para preencher as colunas da matriz 1 com numeros aleatorios
                matriz1[i][j]= all.nextInt(10); // Na matriz1 linha i e coluna j receberá um numero aleatorio
            }
        }
        for (int i=0; i<3; i++){ // for para preencher as linhas da matriz 2 com numeros aleatorios
            for(int j=0; j<3; j++){ // for para preencher as colunas da matriz 2 com numeros aleatorios
                matriz2[i][j]= all.nextInt(10); // Na matriz2 linha i e coluna j receberá um numero aleatorio
            }
        }
        for (int i=0; i<3; i++){ // for usado para percorrer as linhas das matrizes 1, 2 e 3 para que haja a interação necessaria pra preencher a matriz 3
            for(int j=0; j<3; j++){// for usado para percorrer as colunas das matrizes 1, 2 e 3 para que haja a interação necessaria pra preencher a matriz 3
                for (int k=0; k<3; k++){ // laço de repetição utilizado para multiplicar a matriz 1 pela 2 e preencher a matriz 3
                    matriz3[i][j]+= matriz1[i][k]*matriz2[k][j]; // multiplica as casas das matrizes 1 e 2 e adiciona na matriz 3
                }
            }
        }
        for (int i=0; i<3; i++){ // For usado para imprimir a matriz 3, indicando a linha que será impressa
            for (int j=0; j<3; j++){//For usado para imprimir a matriz 3, indicando a coluna que será impressa
                System.out.print("   "+matriz3[i][j]); // Print para imprimir o elemento da matriz 3 linha i e coluna j
            }
            System.out.println("");// Print usado para saltar linha e não ficar todos os elementos em uma linha só
        }

    }
}