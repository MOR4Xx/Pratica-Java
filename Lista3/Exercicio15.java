//- Faça um programa que leia um vetor de 15 posições e o compacte, ou seja, elimine as posições com
//valor zero. Para isso, todos os elementos à frente do valor zero, devem ser movidos uma posição
//para trás no vetor.
package lista6;
import java.util.Scanner; // Importa o pacote do scanner

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); // Cria um Scanner
        int[] c1 = new int[5]; // Declara um vetor de inteiros "c1" com tamanho 5
        int[] c2 = new int[5]; // Declara um vetor de inteiros "c2" com tamanho 5
        int i = 0; // Declara uma variável inteira com valor 0
        double produto = 0; // Declara uma variável double com valor 0

        for (i = 0; i < 5; i++) { // Inicia um for de 0 a 4
            System.out.println("Digite um valor: "); // Imprime uma mensagem pedindo ao usuário para inserir um valor
            c1[i] = leia.nextInt(); // Lê um valor inteiro fornecido pelo usuário e o armazena no vetor "c1"
        }

        System.out.println("Segundo vetor:"); // Imprime uma mensagem indicando o início do segundo vetor
        for (i = 0; i < 5; i++) { // Inicia um for de 0 a 4
            System.out.println("Digite um valor: "); // Imprime uma mensagem pedindo ao usuário para inserir um valor
            c2[i] = leia.nextInt(); // Le um valor inteiro fornecido pelo usuário e o armazena no vetor "c2"
        }

        for (i = 0; i < 5; i++) { // Inicia um for de 0 a 4
            produto = produto + (c1[i] * c2[i]); // Calcula o produto escalar dos elementos de "c1" e "c2" e acumula em "produto"
        }

        System.out.println("O produto escalar é: " + produto); // Imprime o resultado do produto escalar
        leia.close(); // Fecha o scanner
    }
}