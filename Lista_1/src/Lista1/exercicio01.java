package Lista1;
import java.util.Scanner;
public class exercicio01 {

	public static void main(String[] args) {
		try (Scanner print = new Scanner(System.in)) {
			System.out.println("diga sua primeira nota");
			int nota1 = print.nextInt();
			System.out.println("diga sua segunda nota");
			int nota2 = print.nextInt();
			int media= (nota1 + nota2) / 2;
			if (media >=6 ){
				System.out.println("voce foi aprovado " + media);
			} else {
				System.out.println("voce foi reprovado " + media);
			}
		}
}

		
	}


