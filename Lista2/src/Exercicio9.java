
public class Exercicio9 {
    public static void main(String[] args){
        final double cm=2.54;
        double pol=0;
        for (pol=0; pol<=10; pol+=0.5){
            double cmf= cm*pol;
            System.out.println(pol+" - "+cmf);
        }
    }
}
