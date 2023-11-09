package lista6;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cand1=0, cand2=0, cand3=0,cand4=0,nulo=0,branco=0,i=0;
        double total=0;
        while(i < 10) {
            System.out.println("escolha uma opção: 1=cand1: 2=cand2: 3=cand3: 4=cand4: 5=nulo: 6=branco:");
            int menu = scanner.nextInt();
            if(menu<=6){
            switch (menu) {
                case 1:
                    cand1++;
                    i++;
                    total++;
                    break;
                case 2:
                    cand2++;
                    total++;
                    i++;
                    break;
                case 3:
                    cand3++;
                    total++;
                    i++;
                    break;
                case 4:
                    cand4++;
                    total++;
                    i++;
                    break;
                case 5:
                    nulo++;
                    total++;
                    i++;
                    break;
                case 6:
                    branco++;
                    total++;
                    i++;
                    break;
            }
            }
            else{
                System.out.println("digite uma opção valida");
            }
            
        }
        double porcent = ((nulo/total)*100);
        System.out.println("o candidato 1 teve "+cand1+" votos.");
        System.out.println("o candidato 2 teve "+cand2+" votos.");
        System.out.println("o candidato 3 teve "+cand3+" votos.");
        System.out.println("o candidato 5 teve "+cand4+" votos.");
        System.out.println("foram "+nulo+" votos nulos.");
        System.out.println("foram "+branco+" votos Brancos.");
        System.out.println(porcent+"% "+"Dos votos foram nulos.");
        scanner.close();
        
    }
}
