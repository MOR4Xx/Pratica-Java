import java.util.*;

public class Exercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random all = new Random();
        int[] v = new int[10];
        for (int i =0; i<10; i++){
            v[i]= all.nextInt();
        }
        System.out.print("Digite um valor para X menor ou igual a 10:");
        int X = sc.nextInt();
        System.out.print("Digite um numero para Y menor ou igual a 10:");
        int Y = sc.nextInt();

        int soma = v[X]+v[Y];
        System.out.println("A soma da posição "+X+"="+v[X]+" e da posição "+Y+"="+v[Y]+" é: "+soma);
        sc.close();
    }
}
