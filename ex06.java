package ListaExercicios;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        if (valor < 0 || valor > 100 ){
            System.out.println("Fora de intervalo.");
        }
        else if ( valor <= 25){
            System.out.println("Intervalo [0, 25]");
        }
        else if (valor <= 50) {
            System.out.println("Intervalo [26, 50]");
        }
        else if (valor <= 75){
            System.out.println("Intervalo [51, 75]");
        }
        else {
            System.out.println("Intervalo [76, 100]");
        }
        sc.close();
    }
}
