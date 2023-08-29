package teste;
import java.util.Scanner;
public class atividade6 {
	
public static void main(String[] args) {
	
	Scanner print = new Scanner(System.in);
	System.out.println("diga quantas horas voce trabalhou esse mes");
	int horas = print.nextInt();
	System.out.println("qual seu salario por hora?");
	int salario = print.nextInt();
	double total = (160 * salario) + (horas - 160) * ( salario * 1.5) ;
	System.out.println("voce recebeu esse valor atividade chata " + total);
}
}