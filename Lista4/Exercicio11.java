import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho da Imagem: ");
        int size = sc.nextInt();
        char[][] imagem = new char[size][size];
        imagemAll(imagem, size);
        sc.close();
    }

    public static void imagemAll(char[][]imagem, int size){
        Random all = new Random();
        int caracter=0;
        for(int i=0; i<=size; i++){
            for(int j=0; j<=size; j++){
                caracter= all.nextInt(10);
                if(caracter<=5){
                    System.out.print('*');
                }else if(caracter>=5){
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

    }
    
}
