package teste;
import java.util.Scanner;
public class atividade2 {

	public static void main(String[] args) {
		
		Scanner print = new Scanner(System.in);
		
		
		
		System.out.println("A proxima eleiçao sera em que ano?");
		int ano1 = print.nextInt();
	  System.out.println("em que ano voce nasceu?");
	  	int ano2 = print.nextInt();
	  	int eleiçao= ano1 - ano2;
	  	if (eleiçao >= 18) {
			System.out.println("voce tem " + eleiçao + " anos, entao precisa votar");
		} else {
			System.out.println("voce tem " + eleiçao + " anos, entao  nao precisa votar");
		}
	}

}
