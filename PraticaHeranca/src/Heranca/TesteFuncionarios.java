package Heranca;

public class TesteFuncionarios {

	public static void main(String[] args) {
		
	Gerente gerente = new Gerente("Pedro", 10000, "adm", 1234);
	
	Secretaria  secretaria = new Secretaria("Meire", 5000, 1414);
	
	Telefonista telefonista = new Telefonista("Any", 3000, 281);
	
	System.out.println("nome do gerente: " + gerente.getNome() + "\n login: "+ gerente.login + "\n senha: "+ gerente.senha+"\n salario: R$ "+ gerente.getSalario()+"\n");
	
	System.out.println("name da secretaria: "+secretaria.getNome()+"\n codigo: " + secretaria.codigo + "\n salario: R$ "+ secretaria.getSalario()+"\n");

	System.out.println("name da telefonista: "+telefonista.getNome()+"\n codigo: " + telefonista.ramal + "\n salario: R$ " + telefonista.getSalario()+"\n");
	
	}
	
}
