import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat format= new DecimalFormat("0");
        double ts=0, tc=0, tr=0, total=0;
        String tipo;
        System.out.print("Digite a quantidade de testes: ");
        double n = sc.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("Digite a quantidade de cobaias:");
            int quant= sc.nextInt();
            System.out.println("Digite o tipo do cobaia(r:rato, c:coelho, s:sapo): ");
            tipo = sc.next();
            if (tipo.equals("c")){
                tc +=quant;
            }else if (tipo.equals("s")){
                ts += quant;
            }else if (tipo.equals("r")){
                tr += quant;
            }
            total +=quant;
            quant=0;
        }
        double persentualC= (tc/total)*100;
        double persentualR= (tr/total)*100;
        double persentualS= (ts/total)*100;

        System.out.println("O total de cobaias foi: "+format.format(total));
        System.out.println("O total de cobaias Coelho foi: "+format.format(tc));
        System.out.println("O percentual de coelhos foi: "+format.format(persentualC));
        System.out.println("O total de cobaias Sapo foi: "+format.format(ts));
        System.out.println("O percentual de coelhos foi: "+format.format(persentualS));
        System.out.println("O total de cobaias Rato foi: "+format.format(tr));
        System.out.println("O percentual de coelhos foi: "+format.format(persentualR));

        sc.close();
    }
}
