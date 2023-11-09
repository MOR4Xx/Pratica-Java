package lista6;

import java.util.Scanner; //importa o pacote do scanner

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //criação do scanner
        String nmes = ""; //criação da variavel para armazenar o mês por extenso
        System.out.println("digite a Data. Exemplo:(10052023):"); //mostra ao usuario um texto para que ele insira a data corretamente
        int data = scanner.nextInt(); //cria uma variavel para que o scanner armazene ela para ser usada posteriormente
        scanner.close(); //fechamento do scanner
        int dia = (data / 1000000); // aqui cria a variavel dia e é feita a decomposição da data dando o valor do dia
        int mes = (data % 1000000) / 10000;// aqui cria a variavel mês e faz a decomposição do restante da ultima decomposição e da o valor do mês
        int ano = (data % 10000);// aqui cria a variavel ano e é feita a decomposição do restante da variavel mes e da o valor do ano
        switch (mes) { // aque é um switch case que vai pegar o valor da variavel mês e vai adicionar o mes correspondente na variavel "nmês"
            case 1://caso a variavel for 1
                nmes = "janeiro";// se caso o valor da variavel mes for 1 será adicionado o valor a ela
                break;//função para parar o switch case
            case 2: //caso a variavel for 2
                nmes = "fevereiro";// se caso o valor da variavel mes for 2 será adicionado o valor a ela
                break;//função para parar o switch case
            case 3://caso a variavel for 3
                nmes = "março";// se caso o valor da variavel mes for 3 será adicionado o valor a ela
                break;//função para parar o switch case
            case 4://caso a variavel for 4
                nmes = "abril";// se caso o valor da variavel mes for 4 será adicionado o valor a ela
                break;//função para parar o switch case
            case 5://caso a variavel for 5
                nmes = "maio";// se caso o valor da variavel mes for 5 será adicionado o valor a ela
                break;//função para parar o switch case
            case 6://caso a variavel for 6
                nmes = "junho";// se caso o valor da variavel mes for 6 será adicionado o valor a ela
                break;//função para parar o switch case
            case 7://caso a variavel for 7
                nmes = "julho";// se caso o valor da variavel mes for 7 será adicionado o valor a ela
                break;//função para parar o switch case
            case 8://caso a variavel for 8
                nmes = "agosto";// se caso o valor da variavel mes for 8 será adicionado o valor a ela
                break;//função para parar o switch case
            case 9://caso a variavel for 9
                nmes = "setembro";// se caso o valor da variavel mes for 9 será adicionado o valor a ela
                break;//função para parar o switch case
            case 10://caso a variavel for 10
                nmes = "outubro";// se caso o valor da variavel mes for 10 será adicionado o valor a ela
                break;//função para parar o switch case
            case 11://caso a variavel for 11
                nmes = "novembro";// se caso o valor da variavel mes for 11 será adicionado o valor a ela
                break;//função para parar o switch case
            case 12://caso a variavel for 12
                nmes = "dezembro";// se caso o valor da variavel mes for 12 será adicionado o valor a ela
                break;//função para parar o switch case
            default: //caso o valor da variavel não estivar no case
            break;//função para parar o switch case
        }
        System.out.println(dia+" de "+nmes+" de "+ano); //imprime a data formatada
    }
}
