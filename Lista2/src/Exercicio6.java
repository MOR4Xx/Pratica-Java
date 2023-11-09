import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = 0, i=0;
        System.out.print("Digite o inicio do intervalo: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o fim do Intervalo: ");
        int fim = sc.nextInt();
        if (inicio%2==0){
            inicio++;
            System.out.println(inicio);
            num=inicio;
            for(i=0; i<=fim; i++){
                if (num%2!=0){
                    System.out.println(num);
                    num++;
                }else {
                    num++;
                }
            }
        }else {
            for(i=0; i<=fim; i++){
                if (num%2!=0){
                    System.out.println(num);
                    num++;
                }else {
                    num++;
                }
            }
        }
        sc.close();
    }
}
