package ListaExercicios;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double imposto = 0,salario = sc.nextDouble();

        if (salario <= 2000){
            System.out.println("Isento");
        }
        else if (salario <= 3000){
            imposto = (salario-2000)*0.08;
        }
        else if (salario <= 4500){
            imposto = ((salario-3000)*0.18)+(1000*0.08);
        }
        else {
            imposto = ((salario-4500)*0.28)+(1000*0.08)+(1500*0.18);
        }

        System.out.println("O valor do imposto de renda foi de R$"+imposto);
        sc.close();
    }
}
