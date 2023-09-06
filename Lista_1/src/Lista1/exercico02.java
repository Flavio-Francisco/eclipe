package Lista1;
import java.util.Scanner;
public class exercico02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("A proxima eleiçao sera em que ano?");
		int ano1 = input.nextInt();
	  System.out.println("em que ano voce nasceu?");
	  	int ano2 = input.nextInt();
	  	int eleiçao= ano1 - ano2;
	  	if (eleiçao >= 18) {
			System.out.println("voce tem " + eleiçao + " anos, entao precisa votar");
		} else {
			System.out.println("voce tem " + eleiçao + " anos, entao  nao precisa votar");
		}
	}

	@Override
	public String toString() {
		return "atividade2 []";
	}

}
