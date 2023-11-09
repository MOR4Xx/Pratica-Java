import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int vmenor=1000000000, vmaior=0, soma=0;

        for(int i=0; i<=10; i++){
            System.out.print("Digite um numero: ");
            int valor= sc.nextInt();
            if (valor<vmenor){
                vmenor= valor;
            } else if (valor>vmaior) {
                vmaior= valor;
            }
            soma= soma+valor;
        }
        int media= soma/100;
        System.out.println("A soma dos valores é: "+soma);
        System.out.println("A media dos valores é: "+media);
        System.out.println("O menor valor é: "+vmenor);
        System.out.println("O maior valor é:"+vmaior);

        sc.close();
    }
}
