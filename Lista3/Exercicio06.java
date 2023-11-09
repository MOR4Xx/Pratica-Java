package Prog2Lista1;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Declração do Scanner
        int a1=1, a2=1;//Declaração de variaveis
        System.out.print("Digite o numero de de termos que deseja exibir: "); //Pergunta ao usuario quantos trmos da sequencia ele deseja imprimir
        int n = sc.nextInt(); //Faz a leitura do número de termos

        for (int i = 0; i<n; i++){//laço que se repet N vezes de acordo com o número insserido pelo usuario
            if (i==1){// Verifica se o i e igual a 1 para impra imprimir o primeiro valor da sequencia que é sempre 1
                System.out.println(a1);//Escreve na tela o primeiro termo
            }
            else{//caso o laço não pare em um sera executado o seguinte bloco de comados
                int fib = a1+a2;// Irá calcular os valores da senquancia a cada volta do laço
                System.out.println(fib);//escreve o valor na tela
                a1= a2;//Atualização dos valores para que o calculo acima seja realizado novamente com os valores necessarios para se obter o proximo termo da sequencia
                a2= fib;//Atualização dos valores para que o calculo acima seja realizado novamente com os valores necessarios para se obter o proximo termo da sequencia
            }
        }
        sc.close();//Fechamento do Scanner
    }
}
