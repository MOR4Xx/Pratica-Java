import java.util.Random;

public class Exercicio03 {
    static int[][] matriz1= new int[20][20];
    static int[][] matriz2= new int[20][20];
    public static void main(String[] args) {
        

        preencher(matriz1, matriz2);
        System.out.println("Matriz 1:");
        imprimir(matriz1);

        System.out.println("\nMatriz 2:");
        imprimir(matriz2);
        
        System.out.println();
        System.out.println("Exercicio 3");

        System.out.println();
        System.out.println("A) Soma");
        soma(matriz1, matriz2);

        System.out.println();
        System.out.println("B) Multiplicação");
        multiplicação(matriz1, matriz2);

        System.out.println();
        System.out.println("C) Subtração");
        subtracao(matriz1, matriz2);

        System.out.println();
        System.out.println("D) Transposta");
        trasnposta(matriz1, matriz2);


    }
    public static void preencher(int[][]matriz1, int[][]matriz2){
        Random all = new Random();
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                matriz1[i][j]= all.nextInt(10);
                matriz2[i][j] = all.nextInt(10);
            }
        }

    }
    public static void imprimir(int[][]imprimir){
        for(int i=0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                System.out.print(imprimir[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void soma(int[][]matriz1, int[][]matriz2){
        int[][] resultado= new int[20][20];
        for(int i=0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        imprimir(resultado);
    }
    public static void multiplicação(int[][]matriz1, int[][]matriz2){
        int[][] resultado= new int[20][20];
        for(int i=0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                resultado[i][j] = matriz1[i][j]*matriz2[i][j];
            }
        }
        imprimir(resultado);

    }
    public static void subtracao(int[][]matriz1, int[][]matriz2){
        int[][] resultado= new int[20][20];
        for(int i=0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                resultado[i][j] = matriz1[i][j]-matriz2[i][j];
            }
        }
        imprimir(resultado);
    }
    public static void trasnposta(int[][]matriz1, int[][]matriz2){
        int[][] resultado= new int[20][20];
        System.out.println("Matriz 1");
        for(int i=0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                resultado[i][j] = matriz1[j][i];
            }
        }
        imprimir(resultado);
        System.out.println();
        System.out.println("Matriz 2");
        for(int i=0; i<4; i++) {
            for (int j = 0; j<4; j++) {
                resultado[i][j] = matriz2[j][i];
            }
        }
        imprimir(resultado);
    }
}