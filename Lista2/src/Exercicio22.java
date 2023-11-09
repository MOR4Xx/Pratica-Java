import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.0");
        System.out.print("Digite a nota 1 do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota 2 do aluno: ");
        double nota2 = sc.nextDouble();

        if((nota1>=0&&nota1<=10)&&(nota2>=0&&nota2<=10)){
            double media = (nota1+nota2)/2;
            System.out.println("A media do aluno é: "+format.format(media));
        }else {
            System.out.println("Notas invalidas!");
        }

        sc.close();
    }
}
