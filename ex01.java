package ListaExercicios;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        if (n>0){
            System.out.println("Positivo!");
        }
        else if (n == 0){
            System.out.println("Nulo!");
        }
        else {
            System.out.println("Negativo!");
        }
        sc.close();
    }
}
