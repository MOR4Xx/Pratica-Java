//Espero que tenha ficado bom, me esforcei bastante pra fazer essa questão, póis queria fazer bem feita e sem bugs,
//provavelmente vai ter bugs pois não sou profissional, pra resolver alguns bugs de entrada eu tive ajuda do grande amigo do programadorChat GPT.
//mas espero que tenha ficado bom.
//Ass: JORGE.
package lista6;

import java.text.DecimalFormat; //Importa o pacote Decimal format
import java.util.Scanner;// Importa o pacote Scanner

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Cria um Scanner pra receber informações digitada pelo usuario
        DecimalFormat ft = new DecimalFormat("0.00"); //Cria um formatador de numeros para que mostre so duas casa apos a virgula
        int[] id_client = new int[200]; //Cria um vetor inteiro para armazenar o id da conta do cliente, com limite de 200 clientes
        String[] nomeclient = new String[200]; // Criam um vetor String para armazenar o nome do cliente com tamanho 200
        String[] senhaclient = new String[200]; //Cria um vetor String para armazenar a senha do cliente com tamanho 200
        double[] saldo_client = new double[200]; // Cria um vetor double para armazenar o saldo do cliente com tamanho 200
        int totalclientes = 0; // Cria e inicializa a variavel inteira "totalclientes" com o valor zero
        int index=0; // Cria e inicializa a variavel inteira "index" com o valor zero, usada paa armazenar a conta do cliente em determinadas intruções
        int menu = 0; // Cria e inicializa a variavel inteira "menu" com o valor zero

        do {
            System.out.println("\n");// Pula uma linha para
            System.out.println("===BANCO UTAÚ S.A===");// Imprime instruções para o usuario
            System.out.println("====================");// Imprime instruções para o usuario
            System.out.println("\n");// Pula uma linha para
            System.out.println("1- Abrir conta");// Imprime instruções para o usuario
            System.out.println("2- Acessar conta");// Imprime instruções para o usuario
            System.out.println("3- Lista de clientes");// Imprime instruções para o usuario
            System.out.println("4- Estatísticas");// Imprime instruções para o usuario
            System.out.println("5- Sair");// Impr ime instruções para o usuario
            menu = sc.nextInt(); // O valor referente ao menu acima
            switch (menu) { //Switch case usado para chamar os metodos, chamando o metodo conforme o valor digitado pelo usuario para entrar no menu
                case 1: // Se o valor da variavel menu for 1 ele vai chamar o metodo abaixo
                    abrirconta(sc, id_client, nomeclient, senhaclient, totalclientes, saldo_client); //Chama o metodo "abrirconta"
                    break; // Finaliza o case
                case 2: // Se o valor da variavel menu for 2 ele vai chamar o metodo abaixo
                    acessarconta(sc, id_client, nomeclient, senhaclient, saldo_client, totalclientes, index, ft); //Chama o metodo "acessarconta"
                    break;// Finaliza o case
                case 3:// Se o valor da variavel menu for 3 ele vai chamar o metodo abaixo
                    clientes(nomeclient, totalclientes, id_client, senhaclient, saldo_client, ft); //Chama o metodo "clientes"
                    break;// Finaliza o case
                case 4: // Se o valor da variavel menu for 4 ele vai chamar o metodo abaixo
                    estatisticas(sc, nomeclient, totalclientes, saldo_client, ft); //Chama o metodo "estatisticas"
                    break;// Finaliza o case
                case 5: // Se o valor da variavel menu for 5 ele sair do case e finalizar o programa
                    return; //Retorna para fora do case, como não tem mais nenhuma instrução fora do case o programa vai finalizar
                default:// Caso nenhum dos valores do case for o valor do menu irá aparecer uma mensgem de "Opção invalida
                    System.out.println("Opção inválida!"); // Imprime a frase "Opção invalida
            }
        } while (menu!=5); //O "do while" continua o loop enquanto o valor da variavel "menu" for diferente de 5

        sc.close(); //Fecha o scanner
    }
    private static int abrirconta(Scanner sc, int[] id_client, String[] nomeclient, String[] senhaclient, int totalclientes, double[] saldo_client) { //Inicialização do metodo "abrirconta"
        System.out.println("\n");
        int parar;
        while (true){
            System.out.print("\nDigite o id da conta: ");// Imprime informação para o usuario
            id_client[totalclientes] = sc.nextInt(); //recebe o valor digitado do usuario e armazena no vetor id_clientes na posição referente ao total de clientes
            System.out.println("Digite o nome do cliente: ");// Imprime informação para o usuario
            sc.nextLine(); //Limpa o buffer do scanner, para não bugar o scanner
            nomeclient[totalclientes] = sc.nextLine(); //Armazerna o nome do cliente no vetor "nomeclient"
            System.out.println("Digite a senha do cliente (5 caracteres):");// Imprime informação para o usuario
            senhaclient[totalclientes] = sc.nextLine();// Armazena a senha do cliente no vetor "senhaclient"
            System.out.println(" ");//Pula linha
            saldo_client[totalclientes] = 0; //Inicializa o saldo do cliente com valor 0 pois foi aberto a conta a pouco tempo, aramazenando no vetor saldo_client
            System.out.println("Clientes");// Imprime informação para o usuario
            for (int i = 0; i <= totalclientes; i++) {// For usado para imprimir o id, nome para que não haja id repitido
                System.out.println("Id: "+ id_client[i]+" Nome: " + nomeclient[i]); //Imprime id e nome dos usuarios ja cadastrados
            }
            System.out.println(" ");//Pular linha
            System.out.println("\nDeseja continuar? 1-Parar 2-Continuar:");//Imprime informação para o usuario
            parar = sc.nextInt(); //Recebe o valor digitado pelo usuario para continuar ou não
            if(parar==1){ //Se a variavel parar for igual a 1 ira encerrar p metodo e voltara para o menu principal
                return totalclientes+1; //Retorna para o menu principal e finaliza o metodo e adiciona 1 ao total de clientes para que na proxima conta seja armazenada corretamente nos vetores
            }else {
                totalclientes+=1; //caso o valor de para não for igual a 1, o laço de repetição ira continuar voltando do começo pra abri outra conta e adiciona 1 na variavel "totalclient" para que a conta seja armazenada corretamente nos vetores
            }
        }
    }
    private static void acessarconta(Scanner sc, int[] id_client, String[] nomeclient, String[] senhaclient, double[] saldo_client, int totalclientes, int index, DecimalFormat ft) { //Inicialização do metodo "acessarconta"
        System.out.print("Digite o ID da conta do cliente:"); //Imprime informações para o usuario
        int id = sc.nextInt(); //recebe o valor digitado pelo usuario usando o scanner
        index = -1;
        for (int i = 0; i < totalclientes; i++) { //For usado para comparar cada id cadastrado no vetor "id_client"
            if (id_client[i] == id) { //If com condição de que se o elemento na posição i do vetor "id_client" for igual ao id digitado pelo usuario ele será ativado
                index = i; // Index usado para salvar a posição da conta no vetor de id, essa variavel vai ser armazenada a conta acessada até logar em outra conta, tambem usada para puxar as informações da conta nos vetores de armazenagem de dados
                break; // Quebra o for e segue o codigo
            }
        }
        if (index == -1) { // Se caso nenhum id for identificado o if será ativado
            System.out.println("Essa conta não existe!"); //Imprime informações para o usuario
            return; //Retorna para o começo do do metodo "acessarconta"
        }

        System.out.print("Digite a senha: ");// Imprime informações para o usuario
        sc.nextLine(); // Limpar o buffer do Scanner antes de ler a senha
        String senha = sc.nextLine(); //Recebe a string digitada pelo usuario

        if (senhaclient[index].equals(senha)) { // O if comprar se a senha digitada com a senha do id digitado
            System.out.println("Acesso permitido!!");// imprime informações para o usuario
            menuconta(sc, id_client, nomeclient, saldo_client, totalclientes, index, ft); //chama o metodo do menu de acesso da conta
        } else {
            System.out.println("Senha inválida!!"); //Imprime informações para o usuario
        }
    }
    private static void clientes(String[] nomeclient, int totalclientes, int[] id_client, String[] senhaclient, double[] saldo_client, DecimalFormat ft) {//Inicialização do metodo "clientes"
        System.out.println("Lista de clientes:");//Imprime informações para o usuario
        for (int i = 0; i < totalclientes; i++) {
            System.out.println("id:" + id_client[i] + " nome:" + nomeclient[i] + " senha:" + senhaclient[i] + " saldo: R$" + ft.format(saldo_client[i]));
        }
    }
    private static void estatisticas(Scanner sc, String[] nomeclient, int totalclientes, double[] saldo_client, DecimalFormat ft) {//Inicialização do metodo "estatisticas"
        int parar=0; //Inicialização de variavel
        int conta=-1, conta2=-1;//Inicialização de variavel
        double maior=0, menor=100000000, dinheirototal=0;//Inicialização de variavel
        while (true){
            for (int i=0; i<totalclientes; i++){
                if(maior<saldo_client[i]){// Compara se "maior" é maior que o saldo do cliente na posição i
                    maior= saldo_client[i];// "maior" recebe o saldo do cliente com mais saldo
                    conta= i;// A variavel "conta1" recebe a conta com o maior saldo
                }
            }
            System.out.println("O cliente gold (maior saldo) é: "+nomeclient[conta]+" com o saldo de: R$"+ft.format(saldo_client[conta]));//Imprime o nome do cliente e o saldo

            for (int i=0; i<totalclientes; i++){
                if(menor>saldo_client[i]){ // Compara se "menor" é menor que o saldo do cliente na posição i
                    menor= saldo_client[i]; // "menor" recebe o saldo do cliente com menos saldo
                    conta2= i; // A variavel "conta2" recebe a conta com o menor saldo
                }
            }
            System.out.println("O cliente azul (menor saldo) é: "+nomeclient[conta2]+" com o saldo de: R$"+ft.format(saldo_client[conta2]));//Imprime o nome do cliente e o saldo

            for (int i=0; i<totalclientes; i++){
                dinheirototal+= saldo_client[i];// Soma os saldos de todos os clientes
            }
            System.out.println("O valor total no banco é: R$"+ft.format(dinheirototal));//Imprime o valor total no banco

            System.out.println(" "); //Imprime informações para o usuario
            System.out.println("\nDeseja continuar? 1-Parar 2-Continuar:"); //Imprime informações para o usuario
            parar = sc.nextInt();  //Recebe o valor digitado pelo usuario para continuar ou não
            if(parar==1){
                return; //Retorna para o menu principal e finaliza o metodo
            }
        }
    }
    private static void menuconta(Scanner sc, int[] id_client, String[] nomeclient, double[] saldo_client, int totalclientes, int index, DecimalFormat ft) { //Inicialização do metodo "menuconta"
        int menu = 0;//Inicialização de variavel
        do {
            System.out.println(" "); //Pula linha
            System.out.println(" ");//Pula Linha
            System.out.println("===BANCO UTAÚ S.A===");//Imprime informações para o usuario
            System.out.println("====================");//Imprime informações para o usuario
            System.out.println(" ");//Imprime informações para o usuario
            System.out.println("1- Depositar");//Imprime informações para o usuario
            System.out.println("2- Sacar");//Imprime informações para o usuario
            System.out.println("3- Saldo");//Imprime informações para o usuario
            System.out.println("4- Pagamento");//Imprime informações para o usuario
            System.out.println("5- Transferência");//Imprime informações para o usuario
            System.out.println("6- Sair da conta");//Imprime informações para o usuario
            menu = sc.nextInt();// recebe o valor digitado pelo usuario
            switch (menu) {
                case 1:
                    depositar(sc, saldo_client, index); //Chama o metodo "depositar"
                    break;// Finaliza o case
                case 2:
                    sacar(sc, saldo_client, index);//Chama o metodo "sacar"
                    break;// Finaliza o case
                case 3:
                    saldo(sc, nomeclient, saldo_client, index, ft);//Chama o metodo "saldo"
                    break;// Finaliza o case
                case 4:
                    pagamento(sc, saldo_client, index);//Chama o metodo "pagamento"
                    break;// Finaliza o case
                case 5:
                    transferir(sc, id_client, saldo_client, totalclientes, index);//Chama o metodo "transferir"
                    break;// Finaliza o case
                case 6:
                    System.out.println("Saindo...");//Imprime informações para o usuario
                    break;// Finaliza o case
                default:
                    System.out.println("Opção inválida!");//Imprime informações para o usuario
            }
        } while (menu !=6);//O "do while" continua o loop enquanto o valor da variavel "menu" for diferente de 6
    }
    private static void depositar(Scanner sc, double[] saldo_client, int index) {//Inicialização do metodo "depositar"
        int parar=0;//Inicialização de variavel
        while (true){
            System.out.print("\nQuanto deseja depositar: R$");//Imprime informações para o usuario
            double valor = sc.nextDouble(); //Recebe o valor digitado pelo usuario
            saldo_client[index]+= valor; //Adiciona o valor ao saldo do cliente que foi armazenado em index
            System.out.println(" ");//Pula linha
            System.out.println("\nDeseja continuar? 1-Parar 2-Continuar:");//Imprime informações para o usuario
            parar = sc.nextInt(); //Recebe o valor digitado pelo usuario para continuar ou não
            if(parar==1){
                return; //Retorna para o menu da conta e finaliza o metodo
            }
        }
    }
    private static void sacar(Scanner sc, double[] saldo_client, int index) { //Inicialização do metodo "sacar"
        int parar=0;//Inicialização de variavel
        while (true){
            System.out.print("\nQuanto deseja sacar: R$"); //Imprime informações para o usuario
            double valor = sc.nextDouble();//Recebe o valor digitado pelo usuario
            if (valor<saldo_client[index]){//Verifica se o cliente tem valor suficiente para sacar
                saldo_client[index]-= valor; //Subtrai o valor no saldo do cliente que foi armazenado em index
            } else {
                System.out.println("Saldo insuficiente!!");//Imprime informações para o usuario
            }
            System.out.println(" "); //Pular linha
            System.out.println("\nDeseja continuar? 1-Parar 2-Continuar:");//Imprime informações para o usuario
            parar = sc.nextInt();//Recebe o valor digitado pelo usuario para continuar ou não
            if(parar==1){
                return; //Retorna para o menu da conta e finaliza o metodo
            }
        }
    }
    private static void saldo(Scanner sc, String[] nomeclient, double[] saldo_client, int index, DecimalFormat ft) { //Inicialização do metodo "saldo"
        int parar=0;//Inicialização de variavel
        while (true){
            System.out.print("Saldo do cliente "+nomeclient[index]+" é R$"+ft.format(saldo_client[index]));//Imprime o nome do cliente e o saldo, ambos armazenados na posição que corresponde a conta armazenada em index
            System.out.println(" ");//Pular linha
            System.out.println("\nDeseja sair? 1-sair 2-Continuar:");//Imprime informações para o usuario
            parar = sc.nextInt();//Recebe o valor digitado pelo usuario para continuar ou não
            if(parar==1){
                return; //Retorna para o menu da conta e finaliza o metodo
            }
        }
    }
    private static void pagamento(Scanner sc, double[] saldo_client, int index) {//Inicialização do metodo "pagamento"
        int parar=0;//Inicialização de variavel
        while (true){
            System.out.print("\nQuanto deseja pagar: R$");
            double valor = sc.nextDouble(); //A variavel recebe o valor digitado pelo usuario
            if (valor<=saldo_client[index]){//Verifica se o cliente tem valor suficiente para pagar
                saldo_client[index]-= valor;//Subtrai o valor no saldo do cliente que foi armazenado em index
            } else {
                System.out.println("Saldo insuficiente!!");//Imprime informações para o usuario
                break; // Quebra o laço de repetição e volta para o começo do metodo
            }
            System.out.println();//Pular linha
            System.out.println(" ");//Pular linha
            System.out.println("\nDeseja fazer outro pagamento? 1-sair 2-Continuar:");//Imprime informações para o usuario
            parar = sc.nextInt();//Recebe o valor digitado pelo usuario para continuar ou não
            if(parar==1){
                return;//Retorna para o menu da conta e finaliza o metodo
            }
        }
    }
    private static void transferir(Scanner sc, int[] id_client, double[] saldo_client, int totalclientes, int index) {//Inicialização do metodo "transferir"
        int parar=0, conta1=-1, conta2=-1;//Inicialização de variavel
        double valor=0;//Inicialização de variavel
        while (true){

            System.out.print("\nValor que vai ser transferido: R$");//Imprime informações para o usuario
            valor= sc.nextDouble(); //A variavel recebe o valor digitado pelo usuario
            saldo_client[index]-=valor; // Subtrai o valor da conta do cliente armazenado em index

            System.out.print("\nDigite o id da conta que irá receber: ");//Imprime informações para o usuario
            conta2= sc.nextInt();//A variavel recebe o valor digitado pelo usuario
            for (int i=0; i<totalclientes; i++){
                if(conta2==id_client[i]){// Compara todos os elementos até encontrar o id correspondente ao valor de "conta2"
                    conta2= i;// "conta2" recebe i que é a posição da conta que recebera
                }
            }
            saldo_client[conta2]+=valor;//Adiciona o valor ao saldo do cliente

            System.out.println();//Pular linha
            System.out.println(" ");//Pular linha
            System.out.println("\nDeseja fazer outro pagamento? 1-sair 2-Continuar:");//Imprime informações para o usuario
            parar = sc.nextInt();//Recebe o valor digitado pelo usuario para continuar ou não
            if(parar==1){
                return;//Retorna para o menu da conta e finaliza o metodo
            }
        }
    }
}