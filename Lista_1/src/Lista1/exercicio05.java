package Lista1;
import java.util.Scanner;
public class exercicio05 {

	public static void main(String[] args) {
		Scanner print = new Scanner(System.in);
		System.out.println("que horas o xadrez começou?");
		int começo = print.nextInt();
		System.out.println("que horas o xadrez acabou?");
		int fim= print.nextInt();
		int tempo = (começo - fim);
		int tempo1 = (fim - começo);
		if (fim < começo) {
			System.out.println("a partida demorou " + tempo + " horas");
		} else if (fim > começo) {
			System.out.println("a partida demorou " + tempo1 + " horas");
		} else{
			System.out.println("a partida demorou 24 horas");
		}
		
	}
}
