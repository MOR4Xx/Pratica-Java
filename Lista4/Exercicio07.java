import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio07 {
public static void main(String[] args) {
        int lin= tamanho();
        int col= tamanho();

        int[][] matrizA = new int[lin][col];
        int[][] matrizB = new int[lin][col];
        int[][] matrizC = new int[lin][col];

        preencher(matrizA, matrizB, lin, col);
        soma(matrizA, matrizB, matrizC, lin, col);
        imprimir(lin, col, matrizC);
    }
    public static int tamanho(){
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas/colunas: "));
        return tamanho;
    }
    public static void preencher(int[][]matrizA, int[][]matrizB,int lin, int col){
        Random all = new Random();
        for (int i=0; i<lin; i++){
            for (int j=0; j<col; j++){
                matrizA[i][j]= all.nextInt(5);
                matrizB[i][j] = all.nextInt(5);
            }
        }
    }
    public static void soma(int[][] matrizA, int[][] matrizB, int[][] matrizC, int lin, int col){
        for (int i=0; i<lin; i++){
            for (int j=0; j<col; j++){
                matrizC[i][j]= matrizA[i][j] + matrizB[i][j];
            }
        }
    }
    public static void imprimir(int lin, int col, int[][]matrizC){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<lin; i++){
            for (int j=0; j<col; j++){
                sb.append(matrizC[i][j]).append(" ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}