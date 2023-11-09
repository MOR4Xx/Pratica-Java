import javax.swing.JOptionPane;

public class Exercicio15 {
    static int posicao = 0;
    static int reptido = 0;
    static char maior = '\0';

    public static void main(String[] args) {
        try {
            String str = JOptionPane.showInputDialog("Digite a String que deseja obter as informações: ");

            primeiraposicao(str);
            JOptionPane.showMessageDialog(null, "Retorno da posição é: " + posicao);

            charreptido(str);
            JOptionPane.showMessageDialog(null, "Retorno do reptido: " + reptido);

            maiorletra(str);
            if (maior != '\0') {
                JOptionPane.showMessageDialog(null, "A maior letra é: " + maior);
            }
        } catch () {
            JOptionPane.showMessageDialog(null, "A entrada é nula. Por favor, forneça uma string válida.");
        }
    }

    public static int primeiraposicao(String str) {
        char caractere = '\0';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != caractere) {
                return posicao = i + 1;
            }
        }
        return posicao = -1;
    }

    public static int charreptido(String str) {
        char comp;
        for (int i = 0; i < str.length(); i++) {
            comp = str.charAt(i);
            int rep = 0;
            for (int j = 0; j < str.length(); j++) {
                if (comp == str.charAt(j)) {
                    rep += 1;
                }
            }
            if (rep >= 2) {
                return reptido = 0;
            }
        }
        JOptionPane.showMessageDialog(null, "Não há caracteres repetidos");
        return reptido = 1;
    }

    public static void maiorletra(String str) {
        for (int i = 0; i < str.length(); i++) {
            char atual = str.charAt(i);
            if (Character.isLetter(atual)) {
                atual = Character.toUpperCase(atual);
                if (atual > maior) {
                    maior = atual;
                }
            }
        }

    }
}