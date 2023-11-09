package lista6;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Declaração do Scanner para leitura dos dados inseridos pelo usuario
        double n=0, r=0, A=0, termo=0, soma=0;//Declaração de variaveis
            System.out.println("Digite o primeiro termo sa PA: ");//pergunta ao ususario qual o primeiro termo da PA
            A = scanner.nextDouble();
            System.out.println("Digite a razão da PA: ");//pergunta ao ususario qual a rasão da PA
            r = scanner.nextDouble();
            System.out.println("Digite a quantidade de termos da PG");//pergunta ao ususario qual a quantidade de termos da PA
            n = scanner.nextDouble();
            termo = A;//A variavel termo passa a ter o valor do primeiro termo para
            soma = A;//A variavel soma passa a ter o valor do primeiro termo para que ao se somar os termos o mesno seja incluido na soma
            System.out.println("termo 1 = "+termo);//Escreve o primeiro termo na tela
            for(int i=1; i<n ;i++){//laço de repetição que irá se repetir de acodo com a quantidade de termos que o usuario solicitou
                termo = termo + r; //  calculo do proximo termo de somano o termo anterior a rasão
                soma = soma + termo;//  calculo da soma dos  termos de somando o termo anterior ao novo termo
                System.out.println("termo "+ (i + 1) + " = " + termo);// escreve o novo termo na tela a cada volta do laço
            }
            
            System.out.println("A soma dos termos é: "+soma); // escreve a soma de todos os termos na tela
            scanner.close();// fechamento do Scanner
    }
}
