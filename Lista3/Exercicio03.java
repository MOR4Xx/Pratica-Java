import java.util.Scanner; // Importa a biblioteca Scanner

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criação do Scanner
        double soma =0; // Declaração da variavel soma para armazenar a soma dos termos
        System.out.print("\nDigite o numero de termos da progreção geometrica: ");// Imprime as instruções para o usuario
        int n = sc.nextInt(); // Declaração da variavel double n para distinguir o número de termos
        System.out.print("\n Digite a razão da progreção geometrica: ");// Imprime as instruções para o usuario
        double r = sc.nextDouble(); // Declaração de variavel double r para distinguir o valor da razão
        System.out.print("\n Digite o termo a1: "); // Imprime as instruções para o usuario
        double a1 = sc.nextDouble(); // Declaração da variavel a1 que é o primeiro termo da pg

        double pg[] = new double[n]; // Declaração do vetor pg para armazenar os valores da pg

        for (int i=0; i<=n-1; i++){// For usado para percorrer o verto e fazer a instruç~~oes devidas
            pg[i]= a1*Math.pow(r, n-1); // adiciona ao vetor o cálculo da formúla da pg na posição i do vetor
            System.out.print(pg[i]+" "); // Imprime o elemento da pg na posição i do vetor
            soma+= pg[i]; // Adiciona na variavel soma o valor do elemento do vetor pg na posição i, para imprimir o valor da soma de todos os elementos
        }
        System.out.println("A soma dos termos da pg é: "+soma); // Imprime o valor da soma de todos os termos da pg

        sc.close();
    }
}
