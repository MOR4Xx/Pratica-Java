package lista6;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nmes = "";
        System.out.println("digite a Data. Exemplo:(10052023):");
        int data = scanner.nextInt();
        scanner.close();
        int dia = (data / 1000000);
        int mes = (data % 1000000) / 10000;
        int ano = (data % 10000);
        switch (mes) {
            case 1:
                nmes = "janeiro";
                break;
            case 2:
                nmes = "fevereiro";
                break;
            case 3:
                nmes = "março";
                break;
            case 4:
                nmes = "abril";
                break;
            case 5:
                nmes = "maio";
                break;
            case 6:
                nmes = "junho";
                break;
            case 7:
                nmes = "julho";
                break;
            case 8:
                nmes = "agosto";
                break;
            case 9:
                nmes = "setembro";
                break;
            case 10:
                nmes = "outubro";
                break;
            case 11:
                nmes = "novembro";
                break;
            case 12:
                nmes = "dezembro";
            default:
            break;
        }
        System.out.println(dia+" de "+nmes+" de "+ano);
    }
}
