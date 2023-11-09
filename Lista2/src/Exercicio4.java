import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        double x= sc.nextDouble();
        System.out.println("Digite o valor de Y: ");
        double y= sc.nextDouble();
        if (x>=1&&y>=1){
            System.out.println("O ponto está no quadrante 1.");
        } else if (y>=1&&x<=1) {
            System.out.println("O ponto está no quadrante 2.");
        } else if (x<=1&&y<=1) {
            System.out.println("O ponto está no quadrante 3.");
        } else if (x>=1&&y<=1) {
            System.out.println("O ponto está no quadrante 4.");
        }
        sc.close();
    }
}
