//Uma sentença é chamada de dançante se sua primeira letra for maiúscula e cada letra subsequente
//for o oposto da letra anterior. Por exemplo, "A b Cd"é uma sentença dançante. Faça um programa
//que transforme a sentença de entrada em uma sentença dançante.
//Observe que todos os espaços da sentença original deverão ser preservados, ou seja, “ sent ence” deverá ser
//convertido para “ SeNt EnCe”.
package lista6;
import java.util.Scanner; //Importa o pacote do Scanner

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Criação do scanner para entrada de dados
        StringBuilder resultado = new StringBuilder(); //Criação de um objeto StringBuilder para armazenar o resultado
        boolean maiuscula = true; //Criação de uma variável booleana para controlar a alternância entre maiúsculas e minúsculas

        while (1 > 0) { //Loop infinito (condição sempre verdadeira)
            System.out.print("Digite uma palavra ou frase: ");
            String frase = scanner.nextLine(); // Lê uma linha de entrada do usuário

            for (int i = 0; i < frase.length(); i++) { // Loop que percorre cada caractere na frase
                char caractere = frase.charAt(i); // Obtém o caractere na posição i da frase

                if (Character.isLetter(caractere)) { // Verifica se o caractere é uma letra
                    if (maiuscula) { // Se a variável "maiuscula" for verdadeira
                        resultado.append(Character.toUpperCase(caractere)); // Adiciona o caractere em maiúscula ao resultado
                    } else {
                        resultado.append(Character.toLowerCase(caractere)); // Adiciona o caractere em minúscula ao resultado
                    }
                    maiuscula = !maiuscula; // inverte o valor da variável "maiuscula"
                } else {
                    resultado.append(caractere); // Se o caractere não for letra, adiciona diretamente no resultado
                }
            }
            System.out.println(resultado); // Imprime o resultado da frase transformada
        }
    }
}
