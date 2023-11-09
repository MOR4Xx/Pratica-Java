import javax.swing.JOptionPane;
public class Exercicio01 {
    static String str="";
    static char caracter;
    static int posicao=0;
    static int reptido=0;
    static char maior='A';
    static int rep=0;
    
    public static void main(String[] args){
        str= JOptionPane.showInputDialog("Digite a String que deseja obter as informações: ");
        primeiraposicao(posicao, caracter);
        JOptionPane.showMessageDialog(null,"Retorno da posição é: "+posicao);

        charreptido(reptido);
        JOptionPane.showMessageDialog(null,"Retorno do reptido: "+ reptido);
        maiorletra(str);
        JOptionPane.showMessageDialog(null, "A maior letra é: "+maior);
    }

    public static int primeiraposicao(int posicao, char caracter){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==caracter){
                return posicao=i+1;
            }
        }
        return posicao=-1;
    }
    public static int charreptido(int reptido){
        char comp;
        for (int i = 0; i < str.length(); i++) {
            comp = str.charAt(i);
            rep = 0;
            for (int j = 0; j < str.length(); j++) {
                if (comp == str.charAt(j)) {
                    rep += 1;
                }
            }
            if (rep >= 2) {

                return reptido=0;
            }
        }
        JOptionPane.showMessageDialog(null, "Não há caracteres repetidos");
        return reptido=1;
    }
    public static char maiorletra(String str){
        for (int i = 0; i < str.length(); i++) {
            char atual = str.charAt(i);
            if (Character.isLetter(atual)) { //verifica se o caracter é uma letra
                atual = Character.toUpperCase(atual);
                if (atual > maior) {
                    maior = atual;
                }
            }
        }
        return maior;
    }
}
