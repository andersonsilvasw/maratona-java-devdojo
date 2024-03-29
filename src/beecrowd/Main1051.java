package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Main1051 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double imposto;
        double salario = sc.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else if (salario > 2000.00 && salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (salario > 3000.00 && salario <= 4500.00) {
            imposto = (salario - 3000.00) * 0.18 + 80.00;
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            imposto = (salario - 4500.00) * 0.28 + 80.00 + 270.00;
            System.out.printf("R$ %.2f\n", imposto);
        }
        sc.close();
    }
}