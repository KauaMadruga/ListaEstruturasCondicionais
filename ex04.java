package ListaExercicios;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hi, hf, total;
        hi = sc.nextInt();
        hf = sc.nextInt();

        if (hi < hf){
            total = hf - hi;
        }
        else {
            total = 24 - (hi - hf);
        }

        System.out.println("O jogo durou "+total+"H!");
        sc.close();
    }
}
