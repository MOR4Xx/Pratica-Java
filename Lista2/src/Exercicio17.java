import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double level_dabriel, level_guarte, atk_dabriel, atk_guarte, def_dabriel, def_guarte, bns_dabriel, bns_guarte, ganhador, valgolpe1, valgolpe2;

        System.out.print("Digite o level do Pokémon de Dabriel:");
        level_dabriel= sc.nextDouble();
        System.out.print("Digite o ataque do Pokémon de Dabriel:");
        atk_dabriel= sc.nextDouble();
        System.out.print("Digite o defesa do Pokémon de Dabriel: ");
        def_dabriel= sc.nextDouble();
        System.out.print("Digite o Bônus do Pokémon de Dabriel:");
        bns_dabriel= sc.nextDouble();

        valgolpe1=(atk_dabriel+def_dabriel)/2;
        if (level_dabriel%2==0){
            valgolpe1=valgolpe1+bns_dabriel;
        }

        System.out.print("Digite o level do Pokémon de guarte: ");
        level_guarte= sc.nextDouble();
        System.out.print("Digite o ataque do Pokémon de guarte:");
        atk_guarte= sc.nextDouble();
        System.out.print("Digite o defesa do Pokémon de guarte: ");
        def_guarte= sc.nextDouble();
        System.out.print("Digite o Bônus do Pokémon de guarte:");
        bns_guarte= sc.nextDouble();

        valgolpe2=(atk_guarte+def_guarte)/2;
        if (level_guarte%2==0){
            valgolpe2=valgolpe2+bns_guarte;
        }

        if (valgolpe1>valgolpe2){
            System.out.println("O ganhador da batalha foi Dabriel");
        }else {
            System.out.println("O ganhador da batalha foi Guarte");
        }

        sc.close();
    }
}
