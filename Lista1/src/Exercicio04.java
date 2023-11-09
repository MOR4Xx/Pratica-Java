package lista6;

import java.util.Random;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int tent=0,chute = 0;
        int numaleatorio = random.nextInt(100);

        while (chute != numaleatorio) {

            System.out.print("digite um número:");
            chute = scanner.nextInt();

            if (chute > numaleatorio) {
                System.out.println("seu chute foi alto.");
                tent ++;
            }

            else {
                if (chute < numaleatorio) {
                    System.out.println("seu chute foi baixo.");
                    tent++;
                }

                else {
                    if (chute == numaleatorio) {
                        System.out.println("você acertou.");
                    }
                }
            }
            if(tent==3){
                System.out.println("você quer continuar? 1 (sim) 2(não)");
                int cont = scanner.nextInt();
                if(cont==2){
                    System.out.println("o número era:"+numaleatorio);
                    break;
                }
                else if(cont==1){
                    tent=0;
                }

            }
        }
        scanner.close();

    }
}
