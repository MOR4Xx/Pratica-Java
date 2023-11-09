import java.util.Scanner;

public class Exercicio19 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, soma=0;
        System.out.print("Digite um número: ");
        num = sc.nextInt();

        for (int i=1; i<=num/2; i++){
            if (num%i==0){
                soma+= i;
            }
        }
        if (soma==num){
            System.out.println("O número "+num+" é um número perfeito.");
        } else {
            System.out.println("O número "+num+" não é um número perfeito.");
        }

        sc.close();
    }
}
