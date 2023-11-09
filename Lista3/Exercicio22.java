package prog2Lista1;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Declaraçõa de um Scanner
        String[] produto = new String[7];//Declaração de um vetor para armazenar o nome dos produtoes
        int[] estoque = new int[7];//Declaração de um vetor para armazenar o estoque
        int[] qminima = new int[7];//Declaração de um vetor para armazenar a quantidade minima
        int[] valor = new int[7];//Declaração de um vetor para armazenar o valor
        int[] valorvenda = new int[7];//Declaração de um vetor para armazenar o valor da venda
        int[] quantvendia = new int[7];//Declaração de um vetor para armazenar quantiade de produtos vendidos
        int i = 0, menu = 10;//Declaração de variaveis
        for (i = 1; i < 7; i++) {//laço de repetição para cadastrar os produdos
            System.out.println("Produto " + i);//informa ao usuario o numero do produto que esta inserindo

            System.out.print("digite o produto: ");// pede para o usuario inserir o nome do produto
            produto[i] = scanner.nextLine();//le as informações digitadas pelo usuario
        }
        for (i = 1; i < 7; i++) {//laço de repetição para cadastrar as demais informações
            System.out.println("digite as informações do produto:" + produto[i]); //informa ao usuario o produto o qual devem ser informadas as informações

            System.out.print("digite a quantidade em estoque: ");// pede para o usuario para inserir a quantidade em estoque
            estoque[i] = scanner.nextInt();

            System.out.print("digite  quantidade minima que deve ser mantida em estoque: ");// pede para o usuario a quantidade minima para estoque
            qminima[i] = scanner.nextInt();

            System.out.print("digite o valor produto: ");// pede para o usuario o valor unitario do produto
            valor[i] = scanner.nextInt();
        }
        while (menu != 0) {//laço de repetição para que o menu possa ser utilizado mais de uma vez
            System.out.println("Qual produto voce vendeu 1, 2, 3, 4, 5 ou 6?");//pergunta qual produto o vendedero vendeu
            menu = scanner.nextInt(); //quarda o numero em uma variavel
            if (menu >= 0 && menu <= 6) {//verifica se o valor informado pelo usuario e vád=lido
                switch (menu) {//caso positivo e executado o switch Case
                    case 1://O case correspondente ao número ira executar o seguinte bloco de comandos para o produto selecionado 
                        System.out.println("quantas unidades voce vendeu?");//pergunda ao usuario quantos produtos ele vendeu
                        quantvendia[1] = scanner.nextInt();//le as informações obtidas do usuario
                        estoque[1] = (estoque[1] - quantvendia[1]);//subtrai a quantia vendia da quantia em estoque
                        valorvenda[1] = quantvendia[1] * valor[1];//caucula o valor total da venda feita
                        if (estoque[1] < qminima[1]) {//verifica se o produto esta quantidade em estoque muito baixa
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque abaixo da mínima. \n");//caso positivo são exibidas estas menssagems na tela
                            System.out.println("o valor desta venda foi de: " + valorvenda[1]);
                        }
                        else{
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque suficiente.");//Caso negativo são exibidas estas menssagems na tela
                            System.out.println("o valor desta venda foi de: " + valorvenda[1]);
                        }
                        break;
                        case 2:
                        System.out.println("quantas unidades voce vendeu?");
                        quantvendia[2] = scanner.nextInt();
                        estoque[2] = (estoque[2] - quantvendia[2]);
                        valorvenda[2] = quantvendia[2] * valor[2];
                        if (estoque[2] < qminima[2]) {
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque abaixo da mínima. \n");
                            System.out.println("o valor desta venda foi de: " + valorvenda[2]);
                        }
                        else{
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque suficiente.");
                            System.out.println("o valor desta venda foi de: " + valorvenda[2]);
                        }
                        break;
                        case 3:
                        System.out.println("quantas unidades voce vendeu?");
                        quantvendia[3] = scanner.nextInt();
                        estoque[1] = (estoque[3] - quantvendia[3]);
                        valorvenda[3] = quantvendia[3] * valor[3];
                        if (estoque[3] < qminima[3]) {
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque abaixo da mínima. \n");
                            System.out.println("o valor desta venda foi de: " + valorvenda[1]);
                        }
                        else{
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque suficiente.");
                            System.out.println("o valor desta venda foi de: " + valorvenda[1]);
                        }
                        break;
                        case 4:
                        System.out.println("quantas unidades voce vendeu?");
                        quantvendia[4] = scanner.nextInt();
                        estoque[4] = (estoque[4] - quantvendia[4]);
                        valorvenda[4] = quantvendia[4] * valor[4];
                        if (estoque[4] < qminima[4]) {
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque abaixo da mínima. \n");
                            System.out.println("o valor desta venda foi de: " + valorvenda[1]);
                        }
                        else{
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque suficiente.");
                            System.out.println("o valor desta venda foi de: " + valorvenda[1]);
                        }
                        break;
                        case 5:
                        System.out.println("quantas unidades voce vendeu?");
                        quantvendia[5] = scanner.nextInt();
                        estoque[5] = (estoque[5] - quantvendia[5]);
                        valorvenda[5] = quantvendia[5] * valor[5];
                        if (estoque[5] < qminima[5]) {
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque abaixo da mínima. \n");
                            System.out.println("o valor desta venda foi de: " + valorvenda[1]);
                        }
                        else{
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque suficiente.");
                            System.out.println("o valor desta venda foi de: " + valorvenda[1]);
                        }
                        break;
                        case 6:
                        System.out.println("quantas unidades voce vendeu?");
                        quantvendia[6] = scanner.nextInt();
                        estoque[6] = (estoque[6] - quantvendia[6]);
                        valorvenda[6] = quantvendia[6] * valor[6];
                        if (estoque[6] < qminima[6]) {
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque abaixo da mínima. \n");
                            System.out.println("o valor desta venda foi de: " + valorvenda[1]);
                        }
                        else{
                            System.out.println("o produto: " + produto[1] + " esta com quantidade de estoque suficiente.");
                            System.out.println("o valor desta venda foi de: " + valorvenda[1]);
                        }
                        break;
                }
            } else {// caso negativo
                System.out.println("Digite uma posição valida");//exibe essa menssagem na tela e o usuario pode digitar o numero do produto de novo
            }
        }
        for(i=1;i<7;i++){
        System.out.println("vendas feitas= "+ quantvendia[i]);// mostra a quantia vendida de todos os produtos
        System.out.println("estoque= "+ estoque[i]);//mostra o estoque de todos os produtos
        }
    }
}
/* O processo do case e igual independente do numero que o usuario inserir*/