//- Ler dois conjuntos de números reais contendo 5 elementos cada, armazenando-os em vetores e
//calcular o produto escalar entre eles. Imprimir os dois conjuntos e o produto escalar, sendo que o
//produto escalar é dado por:
package lista6;
import java.util.Scanner; // Importa o pacote do scanner

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); // cria um scanner
        int[] c1 = new int[5]; // declarta um vetor inteiro de tamanho 5
        int[] c2 = new int[5]; // declarta um vetor inteiro de tamanho 5
        int i = 0; // Declara uma variável inteira com o valor 0.
        double produto = 0; // Declara uma variável double com o valor 0.

        for (i = 0; i < 5; i++) {
            System.out.println("Digite um valor: ");
            c1[i] = leia.nextInt(); // le um valor inteiro da entrada e o armazena na posição "i" do vetor "c1".
            if (i == 5) { // verifica se "i" é igual a 5
                leia.close(); // fecha o scanner
            }
        }
        System.out.println("Segundo vetor:");
        for (i = 0; i < 5; i++) {
            System.out.println("Digite um valor: ");
            c2[i] = leia.nextInt(); // le um valor inteiro da entrada e o armazena na posição "i" do vetor "c2".
        }

        for (i = 0; i < 5; i++) {
            produto = produto + (c1[i] * c2[i]); // calcula o produto escalar e acumula na variável "produto".
        }
        System.out.println("O produto escalar é: " + produto); //imprime o valor do produto escalar.
    }
}