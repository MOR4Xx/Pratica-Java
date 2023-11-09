import java.util.*;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um scanner para receber informações do usuario
        Random all = new Random(); // Cria um randomizador de numeros pra preencher a matriz rapidamente

        System.out.print("\nDigite número de linhas: "); // Imprime as instruções para o usuario
        int lin = sc.nextInt(); // Cria uma variavel para o numero de linhas da matriz e recebe o valor que o usuario digitou
        System.out.print("\nDigite número de coluna: "); // Imprime as instruções para o usuario
        int col = sc.nextInt();// Cria uma variavel para o numero de colnas da matriz e recebe o valor que o usuario digitou
        int[][] matriz = new int[lin][col]; // criação de uma matriz com tamanho lin x col que foram fornecidos pelo usuario

        for (int i=0; i<lin; i++){ // for usado para percorrer as linhas da matriz e preencher os elementos
            for (int j=0; j<col; j++){// for usado para percorrer as colunas da matriz e preencher os elementos
                matriz[i][j]= all.nextInt(10); // Preenche o elemento da matriz na posição linha i e coluna j
            }
        }

        System.out.println("Combinações na diagonal principal"); //print para mostrar informações para o usuario
        for (int i=0; i<lin; i++) { // for para percorrer as linhas da matriz
            for (int j=0; j<col; j++) {// for para percorrer as colunas da matriz
                if (i==j) {// if usado para verificar se i e f são iguais, pois na diagonal principal eles precisam ser iguais
                    System.out.println("("+ i+","+j+")");// Print usado para imprimir os elementos da diagonal pricipal
                }
            }
        }

        System.out.println("Combinações na diagonal secundária"); //print para mostrar informações para o usuario
        for (int i=0; i<lin; i++){ // for para percorrer as linhas da matriz
            for (int j=0; j<col; j++) {// for para percorrer as colunas da matriz
                if (i+j==col-1) { // if para verificar se o elemento está na diagonal secundaria, quando a soma de i e j forem igual ao tamanho-1, o tamanho é definido pelo numero de colunas
                    System.out.println("("+i+","+j+")"); //Print usado para imprimir os elementos da diagonal secundária
                }else { // else vai ser executado quando o if não for ativado
                    System.out.print("x ");// Print que ira imprimir caso o else seja acionado
                }
            }
        }

        System.out.println("Combinações acima da diagonal principal"); //print para mostrar informações para o usuario
        for (int i=0; i<lin; i++) { // for para percorrer as linhas da matriz
            for (int j=0; j<col; j++) {// for para percorrer as colunas da matriz
                if (i<j) {// if usado para filtrar os elementos que serão acima da diagonal principal, que no caso seria na ocasião em que o i é menor que o j ele será impresso
                    System.out.println("("+i+","+j+")");//Print usado para imprimir os elementos acima da diagonal principal
                }else { // else vai ser executado quando o if não for ativado
                    System.out.print("x ");// Print que ira imprimir caso o else seja acionado
                }
            }
        }

        System.out.println("Combinações abaixo da diagonal principal");//print para mostrar informações para o usuario
        for (int i=0; i<lin; i++) { // for para percorrer as linhas da matriz
            for (int j=0; j<col; j++) {// for para percorrer as colunas da matriz
                if (i>j) { // if usado para filtrar os elementos que serão abaixo da diagonal principal, que no caso seria na ocasião em que o i é maior que o j ele será impresso
                    System.out.println("("+i+","+j+")");//Print usado para imprimir os elementos abaixo da diagonal principal
                }else { // else vai ser executado quando o if não for ativado
                    System.out.print("x ");// Print que ira imprimir caso o else seja acionado
                }
            }
        }

        System.out.println("Combinações acima da diagonal secundária");//print para mostrar informações para o usuario
        for (int i=0; i<lin; i++) { // for para percorrer as linhas da matriz
            for (int j=0; j<col; j++) {// for para percorrer as colunas da matriz
                if (i+j<col-1) { // Verifica se está acima da diagonal secundária
                    System.out.println("("+i+","+j+")"); //Print usado para imprimir os elementos acima da diagonal secundaria
                }else { // else vai ser executado quando o if não for ativado
                    System.out.print("x ");// Print que ira imprimir caso o else seja acionado
                }
            }
        }

        System.out.println("Combinações abaixo da diagonal secundária");//print para mostrar informações para o usuario
        for (int i=0; i<lin; i++) { // for para percorrer as linhas da matriz
            for (int j=0; j<col; j++) {// for para percorrer as colunas da matriz
                if (i+j>col-1) { // Verifica se está abaixo da diagonal secundária
                    System.out.println("("+i+","+j+")"); //Print usado para imprimir os elementos abaixo da diagonal secundaria
                }else { // else vai ser executado quando o if não for ativado
                    System.out.print("x ");// Print que ira imprimir caso o else seja acionado
                }
            }
        }

        System.out.println("Combinações na primeira ou última linha, ou primeira ou última coluna"); //print para mostrar informações para o usuario
        for (int i=0; i<lin; i++) { // for para percorrer as linhas da matriz
            for (int j=0; j<col; j++) {// for para percorrer as colunas da matriz
                if (i==0 || i==lin-1 || j==0 || j==col-1) { // Verifica se está na primeira/última linha ou coluna
                    System.out.println("("+i+","+j+")"); //Print usado para imprimir os elementos da matriz
                }else { // else vai ser executado quando o if não for ativado
                    System.out.print("x ");// Print que ira imprimir caso o else seja acionado
                }
            }
        }
        sc.close();
    }
}