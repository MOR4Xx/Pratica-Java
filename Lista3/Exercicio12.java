package prog2Lista1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Declaração do Scanner para fazer a leitura dos dados inseridos pelo usuario
        int[] v1 = new int[10];//Declaração dos vetores:
        int[] v2 = new int[10];//Declaração dos vetores:
        int[] v3 = new int[10];//Declaração dos vetores:
        for (int i=0; i<10; i++){//laço de repetição utilizado para prencher o vetor 1 com os valores digitados pelo usuario
            System.out.println("Dgite os valores do primeiro vetor: ");//informa na tela o que o usuario deve fazer  a cada volta do laço
            v1[i] = sc.nextInt();//Grava a informação inserida pelo usuario na posição i do vetor que e incrementada a cada vola do laço
        }
        for (int j=0; j<10; j++){//laço de repetição utilizado para prencher os vetor 2 com os valores digitados pelo usuario
            System.out.println("Dgite os valores do segundo vetor: ");//informa na tela o que o usuario deve fazer  a cada volta do laço
            v2[j] = sc.nextInt();//Grava a informação inserida pelo usuario na posição i do vetor que e incrementada a cada vola do laço
        }
        for (int k=0; k<10; k++){//laço utilizado para prencher o vetor 3
            if ((k+1)%2==0){// Ccondicional que decide se a posição do vetor e par ou impar atravez do resto da divisão por 2
                v3[k]= v1[k];//caso positivo e gravado na posição o valor da mesma posiçao do vetor 1
            }else {
                v3[k]= v2[k];//caso negativo e gravado na posição o valor da mesma posiçao do vetor 2
            }
        }
        System.out.println("Vetor 1");
        for (int m=0; m<10; m++){//laço de repetição para imprimir o vetor 1
            System.out.print(" "+v1[m]);
        }
        System.out.println(" ");
        System.out.println("Vetor 2");
        for (int n=0; n<10; n++){//laço de repetição para imprimir o vetor 2
            System.out.print(" "+v2[n]);
        }
        System.out.println(" ");
        System.out.println("Vetor 3");
        for (int l=0; l<10; l++){//laço de repetição para imprimir o vetor 3
            System.out.print(" "+v3[l]);
        }

        sc.close();//fechamento do scanner
    }

    }


