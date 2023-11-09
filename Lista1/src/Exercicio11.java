import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1=1, a2=1;
        System.out.print("Digite o numero de de termos que deseja exibir: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            if (i==1||i==0){
                System.out.println(a1);
            }else {
                int fib = a1+a2;
                System.out.println(fib);
                a1= a2;
                a2= fib;
            }
        }

        sc.close();
    }
}
