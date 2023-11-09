import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A conversão de " + celsius + "°C para Fahrenheit é: " + fahrenheit + "°F");

        sc.close();
    }
}