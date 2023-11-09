import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        DecimalFormat format= new DecimalFormat("0.00");

        double comb= 3.99, consu, lucro;
        System.out.print("Digite a distancia percorrida pelo odômetro(km): ");
        double km= sc.nextDouble();
        System.out.print("Quantidade gasta de combustível: ");
        double gasto_comb= sc.nextDouble();
        System.out.print("Digite o valor recebido dos passageiros: R$");
        double recebido= sc.nextDouble();

        consu= km/gasto_comb;
        lucro = recebido-(gasto_comb*comb);
        System.out.println("\n O Lucro do dia foi: R$"+format.format(lucro)+"\n E a quantidade de combustivel gasta foi: "+format.format(consu)+"L");

        sc.close();
    }
}
