package teste;
import java.util.Scanner;
public class atividade7 {

	public static void main(String[] args) {
		Scanner print = new Scanner(System.in);
		System.out.println("qual o numero da sua conta?");
		int numero_da_conta = print.nextInt();
		System.out.println("qual seu saldo");
		int saldo = print.nextInt();
		System.out.println("qual seu debito");
		int debito = print.nextInt();
		System.out.println("qual seu credito");
		int credito = print.nextInt();
		
		int saldo_atual = saldo - (debito + credito) ;
		if (saldo_atual > 0) {
			System.out.println("saldo positivo");
		} else {
			System.out.println("saldo negativo");
		}
	}
}
