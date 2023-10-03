package Heranca;
import java.util.ArrayList;
import java.util.List;
public class ListFubcionarios {

	public static void main(String[] args) {
		
		Gerente pedro = new Gerente("Pedro", 10000, "adm", 1234);
		Gerente amanda = new Gerente("Amanda", 10000, "adm", 000);
		Gerente flavio = new Gerente("Flávio", 10000, "adm", 4321);
		
		
		List<Gerente> gerentes = new ArrayList<Gerente>();
		
		// add
		gerentes.add(pedro);
		gerentes.add(amanda);
		gerentes.add(flavio);	
		
		//get
		System.out.println("Gerente 1: " + gerentes.get(0));
		System.out.println("Gerente 2: " + gerentes.get(1));
		System.out.println("Gerente 3: " + gerentes.get(2));
	
		for(int i = 0; i<20 ; i++){
			System.out.print("_");
		}
		
		System.out.println("\n");
		
		//get mais organizado
		
		for (Gerente gerente: gerentes) {
			System.out.println("Gerente: " + gerente.getNome());
			System.out.println("Função do sistema: " + gerente.getLogin()+"\n");
		}
		
		
		for(int i = 0; i<20 ; i++){
			System.out.print("_");
		}
		System.out.println("\n");
		
		//update
		
		 gerentes.get(1).setNome("Meire");
		 
			for (Gerente gerente: gerentes) {
				System.out.println("Gerente: " + gerente.getNome());
				System.out.println("Função do sistema: " + gerente.getLogin()+"\n");
			}
			

			for(int i = 0; i<20 ; i++){
				System.out.print("_");
			}
			System.out.println("\n");
			
			//delete
			
			gerentes.remove(0);
			for (Gerente gerente: gerentes) {
				System.out.println("Gerente: " + gerente.getNome());
				System.out.println("Função do sistema: " + gerente.getLogin()+"\n");
			}
			
	}

}
