//Escreva um programa para imprimir as letras de Z a A usando laço de repetição

package lista6;
public class Exercicio05 {
    public static void main(String[] args) {
        for (int i = 90; i >= 65; i--) { //laço de repetição para que imprimar as letras corretamente
            char frase = (char) i; //criaçã da variavel que recebera o valor de i e transformara o valor de i em letra conforme a tabela ascii
            System.out.println(frase); // usado para imprimir a letra do alfabeto
        }
    }
}
