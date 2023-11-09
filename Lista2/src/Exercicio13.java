import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=0, j;
        System.out.print("Digite a frase: ");
        String frase= sc.nextLine();

        for(i=0, j=frase.length()-1; i<j; i++,j--){
            if(frase.charAt(i) != frase.charAt(j)){
                break;
            }
        }
        if (i>=j){
            System.out.println("É um palíndromo!");
        }else {
            System.out.println("Não é um palíndromo!");
        }

        sc.close();
    }
}
