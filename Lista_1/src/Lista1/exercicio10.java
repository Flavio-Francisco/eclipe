package Lista1;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
			Scanner print = new Scanner(System.in);
			System.out.println("quantas maças voce comprou?");
			
			float valor1 = 1.30f;
			float valor2 = 1.00f;
			int maça = print.nextInt();
			if (maça < 12 ) {
				
				System.out.println("voce gastou " + maça * valor1 + " reais");
			} else {
				System.out.println("voce gastou " + maça * valor2 + " reais " );
	}
		}

	}

