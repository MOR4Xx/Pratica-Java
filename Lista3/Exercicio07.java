//Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um
//programa para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos dígitos
//de A.
package lista6;

import java.util.Scanner; //importando o pacote do scanner
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //criação do scanner
        int a, b, digA, digB; //declaração das variaveis do tipo inteira
        boolean encaixa= true; //declaração de variavel do tipo boleana

        System.out.print("Digite o valor de A: "); //imprime instruções para o usuario inserir o valor
        a = sc.nextInt(); // uso do scanner para armazenar o valor na variavel "a"
        System.out.print("Digite o valor de B: "); //imprime instruções para o usuario inserir o valor
        b = sc.nextInt(); // uso do scanner para armazenar o valor na variavel "b"

        while(a>0 && b>0 && encaixa==true){ //criação de um laço de repetição while, usado para fazer a decomposiçã dos valores e ver se os numeros encaixa
            digA = a%10;// pega o último dígito de "a" e armazena em "digA"
            a = a/10;// remove o ultimo digito da variavel "a"
            digB = b%10;// pega o último dígito de "b" e armazena em "digB"
            b = b/10;// remove o ultimo digito da variavel "a"
            if (digA!=digB){ // se os últimos dígitos de 'a' e 'b' não for iguais vai entrar no laço
                encaixa= false; //a variavel recebe o valor falso se entrar no laço
            }
        }
        if (encaixa==true && a>=b){ //se "encaixa" ainda for verdadeiro e o restante de "a" for maior ou igual a "b"
            System.out.println("Encaixa"); //imprime "encaixa", se caso a variavel encaixa continuar verdadeira
        }else { //se caso a variavel "encaixa" for falsa vai entra no else
            System.out.println("Não Encaixa"); // ira imprimir "Não encaixa" se entrar no else
        }
        sc.close(); //fechando o scanner
    }
}
