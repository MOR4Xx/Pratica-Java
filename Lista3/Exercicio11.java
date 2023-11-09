//Faça um programa que leia um vetor de 10 números. Leia um número x. Conte os múltiplos de um
//número inteiro x, e imprima o total.
package lista6;

import java.util.Scanner;// importa o pacote do scanner
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //criação do scanner
        int[] num = new int[10];// declaraçã de um vetor com tamanho de 10 casas
        int quant=0; //cria uma variavel inteira com valor zero

        System.out.println("Digite 10 números:"); //imprime instruções para o usuario digitar os 10 valores
        for (int i=0; i<10; i++) { //laço de repetiçãp para que seja armazenado dez valores
            num[i] = sc.nextInt(100);//armazena os valores no vetor "num"
        }
        System.out.print("Digite um número x: ");// imprime para que o usuario digite um numero x
        int x = sc.nextInt();// define uma variavel inteira que será armazenada o valor de x
        for (int j=0; j<10; j++){// laço de repetição que ira percorrer pelo o vetor
            if(num[j]%x==0){ // if que sera ativado caso o valor de "num" for divisivel por "x"
                quant++;// adiciona 1 a variavel "quant", para contar quantos dos numeros do vetor é divisivel por x
            }
        }
        System.out.println("Quantidade de multiplos de "+x+" é "+quant);// imprime a variavel "x" e depois a quantidade de divisiveis por ele
    }
}
