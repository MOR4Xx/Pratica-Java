//- Faça um programa que leia um vetor com 20 números inteiros. Escreva os elementos do vetor
//eliminando elementos repetidos.
package lista6;
import java.util.Random;//Importa o pacote Random
public class Exercicio19 {
    public static void main(String[] args){
        Random all = new Random(); // Criação de um randomizador all de numeros para completar o vetor
        int[] vetor = new int[20]; // Criação de um vetor inteiro de tamanho 20
        for (int i=0; i<vetor.length; i++){ // Laço de repetição pra preencher o vetor
            vetor[i]= all.nextInt(50);// Adiciona um numero aleatorio ao vetor na posição i, usando a função Random
        }
        for (int j=0; j< vetor.length; j++){// Laço de repetição para tirar os elementos repetidos
            int num = vetor[j]; // Criação da variavel inteira num, sempre vai ser inicializada com o valor do vetor na posição i a cada volta do laço
            for (int k=j+1; k<vetor.length-1; k++){ // Laço que vai percorrer o vetor novamente para ver se tem um elemento repetido
                if (vetor[k+1]==num){// if criado para verificar se o elemento do vetor na posição k é igual o elemento do vetor na posição i
                    vetor[k]=0; // Caso os elementos forem iguais o valor na posição k será substituido por 0
                }
            }
        }
        for (int l=0; l<vetor.length; l++){// Laço feito para imprimir o vetor depois de tirar os elementos iguais
            System.out.print(" "+vetor[l]); // Imprime o elemento do vetor na posição l
        }
    }
}

