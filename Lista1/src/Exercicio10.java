package lista6;

public class Exercicio10 {
public static void main(String[] args) {
    int i=0;
    double trigo=1;
    while(i<64){
        trigo = (trigo*2);
        i++;

    }
    double pagamento = trigo;
    System.out.println("o monge receberá: "+pagamento+" grãos de trigo");
}
}
