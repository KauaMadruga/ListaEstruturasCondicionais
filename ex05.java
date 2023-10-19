package ListaExercicios;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code, quant;
        double valor;

        System.out.println("CARDÁPIO:\n1-Cachorro Quente\n2-X-Salada\n3-X-Bacon\n4-Torrada Simples\n5-Refrigerante\n\nEm seguida digite a quantidade.");

        code = sc.nextInt();
        quant = sc.nextInt();

        if (code ==1){
            valor = quant*4;
        }
        else if (code ==2){
            valor = quant*4.5;
        }
        else if (code ==3) {
            valor = quant*5;
        }
        else if (code ==4) {
            valor = quant*2;
        }
        else {
            valor = quant*1.5;
        }

        System.out.println("O total da conta foi de"+valor);
        sc.close();
    }
}
