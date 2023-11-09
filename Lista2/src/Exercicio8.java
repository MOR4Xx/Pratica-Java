import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Insira o valor de x: ");
        double x = sc.nextDouble();
        System.out.print("Insira o valor de n: ");
        double n = sc.nextDouble();
        double res=Math.pow(x,n);
        System.out.println("o Valor "+x+" elevado a "+n+" é: "+res);
        sc.close();
    }
}
