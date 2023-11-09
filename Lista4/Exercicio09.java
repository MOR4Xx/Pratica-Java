import javax.swing.JOptionPane;

public class Exercicio09 {
    public static void main(String[] args) {
        int lin = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas: "));
        int col = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas: "));
        char[][] matriz = new char[lin][col];

        int linhaInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linha de início: "));
        int colunaInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de coluna de início: "));
        int linhaFim = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linha de fim: "));
        int colunaFim = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de coluna de fim: "));

        preencher(linhaInicio, colunaInicio, linhaFim, colunaFim, matriz);
        imprimir(lin, col, matriz);
    }

    public static void preencher(int linhaInicio, int colunaInicio, int linhaFim, int colunaFim, char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i >= linhaInicio - 1 && i < linhaFim && j >= colunaInicio - 1 && j < colunaFim) {
                    matriz[i][j] = '*';
                } else {
                    matriz[i][j] = '-';
                }
            }
        }
    }

    public static void imprimir(int lin, int col, char[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                sb.append(matriz[i][j]).append("  ");
            }
            sb.append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
