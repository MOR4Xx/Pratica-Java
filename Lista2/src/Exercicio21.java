import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String senha = "2002";
        System.out.print("Digite a senha:");
        String tentativa = sc.nextLine();

        if(tentativa.equals(senha)){
            System.out.println("Acesso Permitido");
        }else {
            System.out.println("Acesso Negado!");
        }

        sc.close();
    }
}
