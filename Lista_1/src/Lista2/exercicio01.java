package Lista2;

import java.util.Scanner;

public class exercicio01 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        do {
            System.out.print("Digite o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();
        } while (valor2 == 0);

        double resultado = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }

}
