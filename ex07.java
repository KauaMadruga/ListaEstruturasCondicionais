package ListaExercicios;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (x == 0 && y == 0){
            System.out.println("O ponto está na Origem");
        }
        else if (x >= 0 && y >= 0){
            System.out.println("O ponto está em Q1");
        }
        else if (x <= 0 && y >= 0){
            System.out.println("O ponto está em Q2");
        }
        else if (x <= 0 && y <= 0){
            System.out.println("O ponto está em Q3");
        }
        else {
            System.out.println("O ponto está em Q4");
        }
        sc.close();
    }
}
