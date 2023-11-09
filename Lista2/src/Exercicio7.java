import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tempo: ");
        int num= sc.nextInt();
        while(num>0){
            System.out.println(num);
            num=num-1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sc.close();
    }
}
