package Prog2Lista1;

import java.util.Random;

public class Exercicio14 {
    public static void main(String[] args) {
        Random all = new Random();//DEclaração de um random para preencher o vetor com numeros aleatorios
        double m=0, media=0, sig=0, p=0;//Declaração de variaveis
        int i;//declaração de variaveis
        int [] vetor = new int[10];//declaração do vetor
        for( i=0; i<10; i++){//Laço de repetição para preencher o vetor
            vetor[i]=all.nextInt(10);// atribui um valor aleatorio entre 0 e 10 a casa I do vetor a cada volta do laço
        }
        for(i=0; i<10; i++){//laço de repetição para somar os valores contidos nele para calcular media
            m= m+vetor[i];//realiza a soma dos valores das posições do vetor
        }
        media =m/10;//calcula a media dos valores so vetor
        for(int k =0; k<10; k++){//laço de repetição para Calcular a soma das diferenças entre cada valor e a média ao quadrado
            p = p + (vetor[k] - media);
        }
        sig= Math.sqrt((p*1)/10); // Calcula o desvio padrão utilizando a fórmula (sqrt(p^2/10))

        System.out.println("Desvio ="+sig);//Imprime o desvio padrão na tela para o usuario
        
    }
    }

