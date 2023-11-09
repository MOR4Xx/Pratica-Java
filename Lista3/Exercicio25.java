// Preencha uma matriz imprimindo apenas os elementos acima da diagonal principal
import java.util.Random; // Importa o pacote Random
import java.util.Scanner; // Importa o pacote Scanner

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um scanner sc para coletar dados
        Random all = new Random(); // Cria um randomizador de numeros para preencher as matrizes
        System.out.print("\nDigite número de linhas: ");// Print usado para dar instruções para o usuario
        int lin = sc.nextInt(); // Criação de uma variavel inteira utilizada para armazenar os dados inseridos pelo usuario
        System.out.print("\nDigite número de coluna: ");// Print usado para dar instruções para o usuario
        int col = sc.nextInt(); // Criação de uma variavel inteira utilizada para armazenar os dados inseridos pelo usuario
        int[][] matriz = new int[lin][col]; // Cria uma matiz com tamanho que foi dado pelas variaveis lin que corresponde a coluna e col que corresponde as colunas

        for (int i=0; i<lin; i++){ // for para preencher as linhas da matriz com numeros aleatorios
            for(int j=0; j<col; j++){// for para preencher as colunas da matriz com numeros aleatorios
                matriz[i][j]= all.nextInt(10); // Na matriz linha i e coluna j receberá um numero aleatorio
            }
        }

        for (int i=0; i<lin; i++) { // for utilizado para percorrer as linhas da matriz para imprimir os elementos acima da diagonal
            for (int j=0; j<col; j++) { // for utilizado para percorrer as colunas da matriz para imprimir os elementos acima da diagonal
                if (i<j) { // if usado para filtrar os elementos que serão acima da diagonal principal, que no caso seria na ocasião em que o i é menor que o j ele será impresso
                    System.out.print(matriz[i][j]+" "); // print usado para imprimir os elementos da matriz na posição linha i e coluna j
                }else { // else vai ser executado quando o valor de i for maior que j
                    System.out.print("x ");// Print que ira imprimir caso o else seja acionado
                }
            }
            System.out.println(); //print usado para pular as linhas da matriz
        }
    }
}
