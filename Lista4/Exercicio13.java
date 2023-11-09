import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        boolean jogando = true;
        char jogadorAtual = 'X';
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tabuleiro[i][j] = ' ';
            }
        }
        
        while (jogando) {
            exibirTabuleiro(tabuleiro);
            System.out.println("É a vez do jogador " + jogadorAtual);
            int linha = entrada("Digite a linha (1, 2 ou 3): ");
            int coluna = entrada("Digite a coluna (1, 2 ou 3): ");

            if (tabuleiro[linha-1][coluna-1] == ' ' ) {
                tabuleiro[linha-1][coluna-1] = jogadorAtual;
                if (vitoria(tabuleiro, jogadorAtual)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("O jogador " + jogadorAtual + " ganhou!!");
                    jogando = false;
                } else if (Velha(tabuleiro)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Deu Velha!!");
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Posição ocupada!!");
            }
        }
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int entrada(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensagem);
        return sc.nextInt();
    }

    public static boolean Velha(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean vitoria(char[][] tabuleiro, char jogadorAtual) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual)
                    ||
                    (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual)
                    ||
                    (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual)
                    ||
                    (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual)) {
                return true;
            }
        }
        return false;
    }
}
