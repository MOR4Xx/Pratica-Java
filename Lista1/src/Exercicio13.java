import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String expressao;
        int parenteseD = 0, parenteseE = 0, tamanho;
        System.out.print("Escreva uma expressão matemática: ");
        expressao = sc.nextLine();
        tamanho = expressao.length();

        for (int i = 0; i < tamanho; i++) {
            if (expressao.charAt(i) == '(') {
                parenteseD++;
            }
            if (expressao.charAt(i) == ')') {
                parenteseE++;
            }
        }
        if (parenteseD != parenteseE) {
            System.out.println("A equação está incorreto.");
        } else {
            System.out.println("A equação está correta.");
        }
        sc.close();
    }
}