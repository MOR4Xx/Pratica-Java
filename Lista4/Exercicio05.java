import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.00");

        JOptionPane.showMessageDialog(null, "Exercicio 05");

        JOptionPane.showMessageDialog(null, "A) Dólar para real (1 dólar = R$ 3,68)");
        dolreal(format);
        JOptionPane.showMessageDialog(null, "b) Real para dólar (1 dólar = R$ 3,68)");
        realdol(format);
        JOptionPane.showMessageDialog(null, "c) Graus celsius para fahrenheit");
        celfar(format);
        JOptionPane.showMessageDialog(null, "d) Centímetros para polegadas");
        cmpol(format);
        JOptionPane.showMessageDialog(null, "e) Polegadas para centímetros");
        polcm(format);
        JOptionPane.showMessageDialog(null, "f) Radianos para graus");
        radgraus(format);
        JOptionPane.showMessageDialog(null, "g) Graus para radianos");
        grausrad(format);
    }
    public static void dolreal(DecimalFormat format){
        final double cotacao = 3.68;
        double dol = Double.parseDouble(JOptionPane.showInputDialog("Valor dolar:"));
        
        double real = dol*cotacao;
        JOptionPane.showMessageDialog(null, "O valor de dolar em real é: "+format.format(real));
    }
    public static void realdol(DecimalFormat format){
        final double cotacao = 3.68;
        double real = Double.parseDouble(JOptionPane.showInputDialog("Valor dolar:"));
        
        double dolar = real/cotacao;
        JOptionPane.showMessageDialog(null, "O valor de Real em dolar é: "+format.format(dolar));
    }
    public static void celfar (DecimalFormat format){
        double celsius= Double.parseDouble(JOptionPane.showInputDialog("Digite os graus Celsius:"));
        
        double fahrenheit = (celsius * 9/5) + 32;
        JOptionPane.showMessageDialog(null, "O valor de celsius em fahrenheit é: "+format.format(fahrenheit));
    }
    public static void cmpol(DecimalFormat format){
        final double pol = 2.54;
        double cm = Double.parseDouble(JOptionPane.showInputDialog("Digite os centimetros:"));
        
        double result = cm*pol;
        JOptionPane.showMessageDialog(null, "O valor de CM em Polegadas é: "+format.format(result));
    }
    public static void polcm(DecimalFormat format){
        final double pol = 2.54;
        double cm = Double.parseDouble(JOptionPane.showInputDialog("Digite as polegadas:"));
        
        double result = cm/pol;
        JOptionPane.showMessageDialog(null, "O valor de polegadas em centimetros é: "+format.format(result));
    }
    public static void radgraus(DecimalFormat format){

        double radianos= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Radianos:"));
        double graus = radianos * (180 / Math.PI);
        JOptionPane.showMessageDialog(null, "O valor de Radianos em graus é: "+format.format(graus));
    }
    public static void grausrad(DecimalFormat format){
        double graus= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Radianos:"));
        double radianos = graus * (Math.PI / 180);
        JOptionPane.showMessageDialog(null, "O valor de graus em radianos é: "+format.format(radianos));
    }
}