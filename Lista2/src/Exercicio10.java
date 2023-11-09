import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Digite o comprimento do comôdo: ");
        double comp= sc.nextDouble();

        System.out.print("Digite a largura do comôdo: ");
        double larg= sc.nextDouble();

        System.out.print("Digite a potência da lâmpada: ");
        double pot= sc.nextDouble();

        double area= larg*comp;
        double lamp= (area*18)/pot;

        System.out.println("O numero de lâmpadas necessarias para o cômodo é: "+lamp);

        sc.close();
    }
}
