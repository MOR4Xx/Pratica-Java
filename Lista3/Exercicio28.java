package prog2Lista1;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Declaração de um Scanner
        int[][] matriz1 = new int[3][3];//Declaração da matriz
        int[] vet = new int[11];//Declaração de um vetor
        int i, j;//Declaração de variaveis
        for (i = 0; i < 3; i++) {////laço para percorrer as linhas da matriz
            for (j = 0; j < 3; j++) {//laço para percorrer as colunas da matriz
                System.out.println("Digite um número:");//pede ao usuario o valor a ser gravado na posição atual dos laços
                matriz1[i][j] = scanner.nextInt();//faz a leitura dos dados inseridos pelo usuario
                if (matriz1[i][j] == 1) {//Da linha 15 a linha 46 e feita a contagem dos elementos de 0 a 10 que aparescem na matriz
                    vet[1]++;
                } else {
                    switch (matriz1[i][j]) {
                        case 2:
                            vet[2]++;
                            break;
                        case 3:
                            vet[3]++;
                            break;
                        case 4:
                            vet[4]++;
                            break;
                        case 5:
                            vet[5]++;
                            break;
                        case 6:
                            vet[6]++;
                            break;
                        case 7:
                            vet[7]++;
                            break;
                        case 8:
                            vet[8]++;
                            break;
                        case 9:
                            vet[9]++;
                            break;
                        case 10:
                            vet[10]++;
                            break;
                    }
                }
            }
        }
        System.out.println("foram: "+vet[1]+" numeros 1");//Escreve a quantidade correscompente de elementos 1
        System.out.println("foram: "+vet[2]+" numeros 2");//Escreve a quantidade correscompente de elementos 2
        System.out.println("foram: "+vet[3]+" numeros 3");//Escreve a quantidade correscompente de elementos 3
        System.out.println("foram: "+vet[4]+" numeros 4");//Escreve a quantidade correscompente de elementos 4
        System.out.println("foram: "+vet[5]+" numeros 5");//Escreve a quantidade correscompente de elementos 5
        System.out.println("foram: "+vet[6]+" numeros 6");//Escreve a quantidade correscompente de elementos 6
        System.out.println("foram: "+vet[7]+" numeros 7");//Escreve a quantidade correscompente de elementos 7
        System.out.println("foram: "+vet[8]+" numeros 8");//Escreve a quantidade correscompente de elementos 8
        System.out.println("foram: "+vet[9]+" numeros 9");//Escreve a quantidade correscompente de elementos 9
        System.out.println("foram: "+vet[10]+" numeros 10");//Escreve a quantidade correscompente de elementos 10
    }
}
