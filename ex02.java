package ListaExercicios;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        if (n%2 == 0){
            System.out.println("O número é par!");
        }
        else if (n == 0){
            System.out.println("O número é nulo!");
        }
        else {
            System.out.println("O número é ímpar!");
        }
        sc.close();
    }
}
