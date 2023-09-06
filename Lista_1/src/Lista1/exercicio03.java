package Lista1;
import java.util.Scanner;
public class exercicio03 {

public static void main(String[] args) {
		
		Scanner print = new Scanner(System.in);
		System.out.println("digite um numero");
		int valor1 = print.nextInt();
		System.out.println("diga outro numero");
		int valor2 = print.nextInt();
		if (valor1 > valor2) {
			System.out.println("o maior numero e o " + valor1);
		} else {
			System.out.println("o maior numero e o " + valor2);
		}
		}
}


