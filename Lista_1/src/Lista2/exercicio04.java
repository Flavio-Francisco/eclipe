package Lista2;

import java.util.Scanner;

public class exercicio04 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor : ");
        valor2 = scanner.nextDouble();

        while (valor2 == 0) {
            System.out.print("Digite o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();
        }

        double resultado = valor1 / valor2;
        System.out.println("O resultado da divisão é: " + resultado);

        scanner.close();
    }

}
