package prog2Lista1;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Declaração de um Scanner
        double[] num = new double[50];//Declaração de um vetor para armazenar a sequencia númerica
        double menor=1000000000, maior=0, quantmenor=0, quantmaior=0;//Declaração de variaveis
        System.out.println("se quiser parar digite 0.");// informa ao usuario que para parar ele deve insserir o valor 0
            for(int i=0; i<50; i++) {// laço de repetição para prencher o vetor
                System.out.print("Digite um numero: ");// pede ao usuario que insira os valores da sequencia
                num[i] = sc.nextDouble();//faz a leitura dos valores inseridos pelo usuario
                if (num[i]<0) quantmenor++;//contador de numeros maiores que 0
                if (num[i]>0) quantmaior++;//contador de numeros menores que 0
                if(num[i]<menor){//testa se o numero inserido e menor que o atual menor a cada volta do laço
                    menor=num[i];//caso positivo atualiza a variavel
                }
                if (num[i]>maior){//testa se o numero inserido e maior que o atual maior a cada volta do laço
                    maior=num[i];//caso positivo atualiza a variavel
                }
                
                if(num[i]==0){//verifica se o valor 0 foi digitado pelo usuario
                    break;//caso positivo para o laço
                }
    }
    System.out.println("maior número= "+maior);//imprime o maior número
    System.out.println("menor número= "+menor);//imprime o menor múmero
    System.out.println("menor que 0= "+quantmenor);//imprime a quantidade de numeros menores que 0
    System.out.println("maior que 0= "+quantmaior);//imprime a quantidade de numeros maiores que 0
    for(int i = num.length-1;i>=0;i--){//laço para escrever o vetor ao contrario
        if(num[i]!=0){// testa se ha algum valor na casa I do vetor, para não imprimir as casas vazias
        System.out.print(num[i]+" ");//caso positivo imprime a casa i do vetor
        }
        }
    }
}

