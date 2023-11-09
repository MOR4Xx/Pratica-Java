import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sheldon escolha (Pedra, Papel, Tesoura, Lagarto ou Spock");
        String escolhashelgon= sc.nextLine();
        System.out.print("Sheldon escolha (Pedra, Papel, Tesoura, Lagarto ou Spock");
        String escolharaj= sc.nextLine();

        if ((escolhashelgon=="Tesoura" && (escolharaj=="Papel" || escolharaj=="Lagarto"))
                || (escolhashelgon=="papel" && (escolharaj=="Pedra" || escolharaj=="Spock"))
                || (escolhashelgon=="Pedra" && (escolharaj=="Tesoura" || escolharaj=="Lagarto"))
                || (escolhashelgon=="Lagarto" && (escolharaj=="Papel" || escolharaj=="Spock"))
                || (escolhashelgon=="Spock" && (escolharaj=="Tesoura" || escolharaj=="Pedra"))) {
            System.out.println("Bazinga!");
        } else if (escolharaj==escolhashelgon) {
            System.out.println("Empate");
        }

        sc.close();
    }
}
